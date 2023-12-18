import java.util.Scanner;

public class Main{
    public static int[][] land;
    public static int W,H; 
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        while(true){
            W=sc.nextInt();
            H=sc.nextInt();
            if(W==0 && H==0)break;
            land=new int[H][W];
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++)land[i][j]=sc.nextInt();
            }   
            int count=0;
            for(int i=0;i<H;i++){
                for(int j=0;j<W;j++){
                    if(land[i][j]==0)continue;
                    dfs(i,j);
                    count++;
                }
            }   
            System.out.println(count);
        }
        sc.close();
    }
    public static void dfs(int h,int w){
        int dh,dw,nh,nw;
        //数え済み
        land[h][w]=0;
        // 八方向を探索
        for(dh=-1;dh<=1;dh++){
            for(dw=-1;dw<=1;dw++){
                nh=h+dh;
                nw=w+dw;
                // 場外
                if( nh<0 || nh >= H || nw < 0 || nw >= W )continue;
                // 海
                if(land[nh][nw]==0)continue;
                // 再帰的に探索
                dfs(nh, nw);
            }
        }
    }
}
