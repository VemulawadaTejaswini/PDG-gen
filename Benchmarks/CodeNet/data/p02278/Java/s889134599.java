
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int SENTINEL = 100000007;
    public static int MAX = 1000;
    public static int VMAX = 10000;

    public static int[] A = new int[MAX];
    public static int n, s;
    public static int[] B = new int[MAX];
    public static int[] T = new int[VMAX + 1];

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = VMAX;
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
            s = Math.min(s, A[i]);
        }

        // ??????
        System.out.println(solve());
    }

    public static int solve() {
        int ans = 0;
        boolean[] V = new boolean[MAX];

        for(int i = 0; i < n; i++){
            B[i] = A[i];
            V[i] = false;
        }
        Arrays.sort(B, 0, n );
        for(int i = 0; i < n; i++) T[B[i]] = i;
        for(int i = 0; i < n; i++) {
            if(V[i]) continue;
            int S = 0;
            int an = 0;
            int m = VMAX;
            int cur = i;
            while(true) {
                V[cur] = true;
                an++;
                int v = A[cur];
                m = Math.min(m, v);
                S += v;
                cur = T[v];
                if(V[cur]) break;
            }
            ans += Math.min(S + (an - 2) * m, m + S + (an + 1) * s);
        }
        return ans;
    }
}