import java.util.*;
//import java.lang.Math;
public class Main{
    public static boolean reach[][]=new boolean[50][50];
    public static int W;
    public static int H;
    public static int S[][]=new int[50][50];
    public static void dfs(int h,int w){
        if(h<0 || h>=H || w<0 || w>=W) return;
        if(reach[h][w]) return;
        if(S[h][w]==0) return;
        reach[h][w]=true;
        dfs(h,w+1);
        dfs(h,w-1);
        dfs(h+1,w);
        dfs(h-1,w);
        dfs(h+1,w+1);
        dfs(h+1,w-1);
        dfs(h-1,w-1);
        dfs(h-1,w+1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            W=sc.nextInt();
            H=sc.nextInt();
            for(int i=0;i<H;i++) for(int j=0;j<W;j++) reach[i][j]=false;
            if(H+W==0) break;
            for(int i=0;i<H;i++) for(int j=0;j<W;j++) S[i][j]=sc.nextInt();
            for(int i=0;i<50;i++) for(int j=0;j<50;j++) if(i>=H || j>=W) S[i][j]=0;
            int ans=0;
            for(int i=0;i<H;i++) for(int j=0;j<W;j++) if(!reach[i][j]) if(S[i][j]==1) {
                dfs(i,j);
                ans++;
            }
            System.out.println(ans);
        }
    }
}
