import java.util.*;

public class Main{
    int[] p;
    void solve(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        p = new int[n];
        for(int i = 0; i < n; i++) p[i] = i;
        for(int i = 0; i < m; i++){
            unite(scan.nextInt() - 1, scan.nextInt() - 1);
        }
        Arrays.sort(p);
        int count = 1;
        for(int i = 0; i < n - 1; i++){
            if(root(p[i]) != root(p[i + 1])) count++;
        }
        System.out.println(count - 1);
    }

    int root(int x){
        if(p[x] == x) return x;
        return p[x] = root(p[x]);
    }

    void unite(int x, int y){
        x = root(x);
        y = root(y);
        if(x == y) return;
        p[x] = y;
    }

    public static void main(String[] args){
        new Main().solve();
    }
}
