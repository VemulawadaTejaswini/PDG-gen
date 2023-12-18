import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.solve(sc);
    }
    int[] gp;
    //Integer[][] aka;
    char[][] arr;
    int[][] dirs = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    boolean[][] aka;
    void solve(Scanner sc){
        int h = sc.nextInt();
        int w = sc.nextInt();
        int r = sc.nextInt()-1;
        int c = sc.nextInt()-1;
        int er = sc.nextInt()-1;
        int ec = sc.nextInt()-1;
        arr = new char[h][w];
        for(int i=0;i<h;i++){
            arr[i] = sc.next().toCharArray();
        }
        aka = new boolean[h][w];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
        pq.add(new int[]{r,c,0});
        aka[r][c] = true;
        while(!pq.isEmpty()){
            int[] ak = pq.poll();
            if(ak[0]==er&&ak[1]==ec){
                System.out.println(ak[2]);
                return;
            }
            dfs(ak[0],ak[1],h,w,pq,ak[2]);
            for(int k=Math.max(0,ak[0]-2);k<=Math.min(h-1,ak[0]+2);k++){
                for(int p=Math.max(0,ak[1]-2);p<=Math.min(w-1,ak[1]+2);p++){
                    if(!aka[k][p]&&arr[k][p]!='#'){
                        pq.add(new int[]{k,p,ak[2]+1});
                        aka[k][p] = true;
                    }
                }
            }

        }
        System.out.println(-1);

    }
    void dfs(int i, int j,int h, int w,PriorityQueue<int[]> pq, int v){
        for(int[] dir :dirs){
            int pi = i+dir[0];
            int pj = j+dir[1];
            if(pi<0||pj<0||pi>=h||pj>=w||aka[pi][pj]||arr[pi][pj]=='#') continue;
            pq.add(new int[]{pi,pj,v});
            aka[pi][pj] = true;
            dfs(pi,pj,h,w ,pq,v);
        }
    }
    int find(int v){
        if(gp[v]<0) return v;
        //System.out.println(v);
        return gp[v] = find(gp[v]);
    }

    void g(int a, int b){
        int pa = find(a);
        int pb = find(b);
        if(pa==pb) return;
        if(gp[pa]<gp[pb]){
            gp[pa]+=gp[pb];
            gp[pb] = pa;
        }else{
            gp[pb]+=gp[pa];
            gp[pa] =pb;
        }
    }
    static long cmp(int[] a, int[] b){
        return (long)Math.abs(a[0]-b[0])+(long)Math.abs(a[1]-b[1]);
    }
}