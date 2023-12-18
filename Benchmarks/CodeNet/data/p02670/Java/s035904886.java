import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class Main {
    int[][] dirs = new int[][]{{0,-1},{1,0},{-1,0},{0,1}};
    void sol(int[][] arr, int[] p){
        //System.out.println("ff");
        int n = arr.length;
        int cnt = 0;
        for(int k=0;k<n*n;k++){
            int v = p[k];
            int i = (v-1)/n;
            int j = (v-1)-i*(n);
            cnt+=bfs(arr,i,j);
        }
        System.out.println(cnt);

    }
    int bfs(int[][] arr, int i, int j){
        LinkedList<int[]> q = new LinkedList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->(a[2]-b[2]));
        pq.add(new int[]{i,j,0});
        int n = arr.length;
        boolean[][] seen = new boolean[n][n];
        PriorityQueue<Integer> res = new PriorityQueue<>();
        while(!pq.isEmpty()){
            int[] a = pq.poll();
            //System.out.println(a[0]+" "+a[1]);
            for(int[] dir:dirs){
                int pi = a[0]+dir[0];
                int pj = a[1]+dir[1];
                if(pi<0||pj<0||pi>=n||pj>=n){
                    res.add(a[2]);
                    continue;
                }
                if(seen[pi][pj]) continue;
                if(arr[pi][pj]>0){
                    pq.add(new int[]{pi,pj,a[2]+1});
                }else{
                    pq.add(new int[]{pi,pj,a[2]});
                }
                seen[pi][pj] = true;
            }
        }
        arr[i][j] = -1;
        return res.poll();
    }




    public static void main(String[] args)  throws IOException {
        // Use the Scanner class

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tot = Integer.parseInt(br.readLine());

        System.out.println();
        String s = br.readLine();
        String[] sr = s.split(" ");
        int[][] arr = new int[tot][tot];
        int[] inp = new int[sr.length];
        for(int k=0;k<sr.length;k++){
            int i = (k)/tot;
            int j = k - i*tot;
            arr[i][j] = k+1;
            inp[k] = Integer.parseInt(sr[k]);
        }
        Main tt = new Main();
        tt.sol(arr,inp);
    }
}
