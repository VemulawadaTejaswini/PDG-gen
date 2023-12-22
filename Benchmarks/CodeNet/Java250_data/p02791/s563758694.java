import java.io.*;
import java.util.*;
import static java.lang.System.in;

public class Main {
    ArrayList<Integer>[] graph;
    HashSet<Integer> cycle;
    int[] prev;
    PrintWriter out = new PrintWriter(System.out);
    // no self-loop or multiple edges
    public static void main(String[] args) throws Exception {
        Main main = new Main();
//        main.solve();
        System.out.println(main.solve());
    }
    long solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        long ans = 0;
        int mini = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]<=mini) ans += 1;
            mini = Math.min(mini,a[i]);
        }
        return ans;
    }
}

