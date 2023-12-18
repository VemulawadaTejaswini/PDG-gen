
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            int t = sc.nextInt();
            int n = sc.nextInt();
            if(t+n==0)break;
            int[][]f = new int[500][500];
            int offset = f.length/2;
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt()+offset;
                int y = sc.nextInt()+offset;
                f[x][y] = -1;
            }
            int sx = sc.nextInt()+offset, sy = sc.nextInt()+offset;

            Queue<int[]>q = new LinkedList<int[]>();
            q.add(new int[]{sx,sy,0});
            f[sx][sy]=1;
            int[] v1 = {0,0,1,1,-1,-1};
            int[] v2 = {-1,1,0,1,0,-1};
            while(!q.isEmpty()){
                int x  =q.peek()[0];
                int y  =q.peek()[1];
                int ct = q.poll()[2];
                if(ct==t)continue;
                for (int i = 0; i < v2.length; i++) {
                    int xx = x+v1[i];
                    int yy = y+v2[i];
                    if(f[xx][yy]==0){
                        f[xx][yy]=1;
                        q.add(new int[]{xx,yy,ct+1});
                    }
                }
            }
            int ans=0;
            for (int i = 0; i < f.length; i++) {
                for (int j = 0; j < f[i].length; j++) {
                    if(f[i][j]==-1)continue;
                    ans+=f[i][j];
                }
            }
            System.out.println(ans);
        }
    }

}