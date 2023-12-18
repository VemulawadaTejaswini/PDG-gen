import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayDeque;

public class Main{
    public static void main(String[] aaa){
        Scanner s = new Scanner(System.in);
        Stack<xy>  sta = new Stack<xy>();
        Stack<Integer> x =new Stack <Integer>();
        Stack<Integer> y =new Stack <Integer>();
        int h,w,i,j,k,l,count=0,xx,yy,nx,ny;
        int[][] memo = new int[51][51];
        xy now=new xy(),next=new xy();
        while(true){
        h = s.nextInt();
        w = s.nextInt();
        if(h==0&&w==0)break;
        for(i=1;i<=h;i++){
            for(j=1;j<=w;j++){
                memo[i][j] = s.nextInt();
            }
        }
        for(i=1;i<=h;i++){
            for(j=1;j<=w;j++){
                if(memo[i][j]==1){
                    memo[i][j]=0;
                    x.push(i);
                    y.push(j);
                    //System.out.println("now"+now.x+" "+now.y);
                    while(x.size()>0&&y.size()>0){
                        nx=x.pop();
                        ny=y.pop();
                        
                        //System.out.println("a"+now.x+" "+now.y);
                        for(k=-1;k<=1;k++){
                            for(l=-1;l<=1;l++){
                                //System.out.println("for"+(now.x+k)+" "+(now.y+l));
                                if((nx+k)>=1&&(nx+k)<=h&&(ny+l)>=1&&(ny+l)<=w&&memo[nx+k][ny+l]==1){
                                    //System.out.println("yor"+(now.x+k)+" "+(now.y+l));
                                    memo[nx+k][ny+l]=0;
                                    x.push(nx+k);
                                    y.push(ny+l);
                                
                                }
                                //System.out.println("oor"+(now.x+k)+" "+(now.y+l));
                            }
                        }
                    }
                    count++;
                }
            }
        }
        System.out.println(count);
        count =0;
        for(i=1;i<=50;i++)for(j=1;j<=50;j++)memo[i][j]=0;
    }
    }
}
class xy{
    int x;
    int y;
}
