// package Contest#176;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int si = Integer.parseInt(st1.nextToken());
        int sj = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int ei = Integer.parseInt(st2.nextToken());
        int ej = Integer.parseInt(st2.nextToken());

        char[][] a = new char[h][w];
        
        for(int i=0; i<h; i++){
            String str = br.readLine();
            for(int j=0; j<w; j++){
                a[i][j] = str.charAt(j);
            }
        }

        bfs(a, si-1, sj-1, ei-1, ej-1, h, w);
        out.close();
    }

    static class Pair{
        int x; int y; int cst;
        Pair(int x, int y, int cst){
            this.x = x;
            this.y = y;
            this.cst = cst;
        }
    }
    
        static int[] walkH = {0,1,0,-1};
        static int[] walkW = {1,0,-1,0};
        static int[] warpH = {1,1,-1,-1,0,1,2,2,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1};
        static int[] warpW = {1,-1,1,-1,2,2,2,1,0,-1,-2,-2,-2,-2,-2,-1,0,1,2,2};

    static void bfs(char[][] a, int si, int sj, int ei, int ej, int h, int w){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(si, sj, 0));

        boolean[][] vis = new boolean[h][w];
        
        while(!q.isEmpty()){
            Pair rem = q.poll();

            if(rem.x == ei && rem.y == ej){
                System.out.println(rem.cst);
                return;
            }

            if(vis[rem.x][rem.y]){
                continue;
            }

            vis[rem.x][rem.y] = true;

            //todo

            for(int k=0; k<4; k++){
                int nx = walkH[k] + rem.x;
                int ny = walkW[k] + rem.y;
                if(nx>=0 && ny>=0 && nx<h && ny<w && a[nx][ny]=='.'){
                    q.add(new Pair(nx, ny, rem.cst));
                }
            }

            for(int k=0; k<warpH.length; k++){
                int nx = warpH[k] + rem.x;
                int ny = warpW[k] + rem.y;
                if(nx>=0 && ny>=0 && nx<h && ny<w && a[nx][ny]=='.'){
                    q.add(new Pair(nx, ny, rem.cst+1));
                }
            }
        }

        System.out.println(-1);
    }
}