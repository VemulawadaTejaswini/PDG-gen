import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.solve(sc);
    }
    int[] gp;
    void solve(Scanner sc){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][2];
        gp = new int[n+1];
        Arrays.fill(gp,-1);
        for(int i=0;i<m;i++){
            arr[i] = new int[]{sc.nextInt(),sc.nextInt()};
        }
        for(int i=0;i<m;i++){
            g(arr[i][0],arr[i][1]);
        }
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans = Math.min(ans,gp[i]);
        }
        System.out.println(-ans);
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