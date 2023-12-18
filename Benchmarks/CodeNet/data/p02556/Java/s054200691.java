import java.util.*;
import java.io.*;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static PrintWriter out = new PrintWriter(System.out);
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long mod = 998244353;
    int n = 1;
    int[] dat;
    int default_value = 0;
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        // int t = sc.nextInt();
        int t= 1;
        while(t-->0){
            out.println(main.solve());
        }
        out.flush();
    }
    long solve() throws Exception {
        int n = sc.nextInt();
        int[][] rec = new int[n][2];
        for(int i=0; i<n; i++){
            rec[i] = new int[]{sc.nextInt(), sc.nextInt()};
        }
        Arrays.sort(rec, (o1, o2)->(o1[0]-o2[0])); // sort according to increasing order of x[i]
        long plus = rec[0][0]+rec[0][1], minus = rec[0][0]-rec[0][1];
        long ans = 0;
        for(int i=1; i<n;i++){
            long temp_plus = rec[i][0]+rec[i][1], temp_minus = rec[i][0]-rec[i][1];
            ans = Math.max(ans, temp_plus-plus);
            ans = Math.max(ans, temp_minus-minus);
            plus = Math.min(plus, temp_plus);
            minus = Math.min(minus, temp_minus);
        }
        return ans;
    }

    int paIn(String s){return Integer.parseInt(s);}
}