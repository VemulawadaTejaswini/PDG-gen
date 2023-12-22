import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
 
public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[][] memo= new int[33][33];
        int[][] mapt = new int[33][33];
        int[][] mapy = new int[33][33];
        int h,w,i,j,nx,ny;
        Queue<Integer> x =new LinkedList<Integer>();
        Queue<Integer> y =new LinkedList<Integer>();
        while(true){
            w = s.nextInt();
            h = s.nextInt();
            if(h+w==0)break;
            for(i=1;i<2*h;i++){
                if(i%2==1)for(j=1;j<w;j++)mapt[i/2+1][j]=1-s.nextInt();
                else for(j=1;j<=w;j++)mapy[i/2][j]=1-s.nextInt();
            }
            x.add(1);
            y.add(1);
            memo[1][1]=1;
            while(x.size()>0&&y.size()>0){
                nx = x.remove();
                ny = y.remove();
                if(mapt[nx][ny-1]==1&&memo[nx][ny-1]==0){
                    x.add(nx);
                    y.add(ny-1);
                    memo[nx][ny-1]=memo[nx][ny]+1;
                }
                if(mapt[nx][ny]==1&&memo[nx][ny+1]==0){
                    x.add(nx);
                    y.add(ny+1);
                    memo[nx][ny+1]=memo[nx][ny]+1;
                }
                if(mapy[nx-1][ny]==1&&memo[nx-1][ny]==0){
                    x.add(nx-1);
                    y.add(ny);
                    memo[nx-1][ny]=memo[nx][ny]+1;
                }
                if(mapy[nx][ny]==1&&memo[nx+1][ny]==0){
                    x.add(nx+1);
                    y.add(ny);
                    memo[nx+1][ny]=memo[nx][ny]+1;
                }
            }
            /*for(i=1;i<=h;i++){
                for(j=1;j<=w;j++){
                    System.out.print(memo[i][j]);
                }
                System.out.println();
            }*/
            System.out.println(memo[h][w]);
            for(i=1;i<2*h;i++){
                if(i%2==1)for(j=1;j<w;j++)mapt[i/2+1][j]=0;
                else for(j=1;j<=w;j++)mapy[i/2][j]=0;
            }
            for(i=0;i<=h;i++)for(j=0;j<=w;j++)memo[i][j]=0;
        }
 
    }
}

