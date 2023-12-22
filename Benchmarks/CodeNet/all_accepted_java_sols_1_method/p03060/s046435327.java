import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] v = br.readLine().split(" ");
        String[] c = br.readLine().split(" ");
        int[] vs = new int[v.length];
        int[] cs = new int[v.length];
        
        for (int i = 0; i < v.length; i++) {
            vs[i] = Integer.parseInt(v[i]);
            cs[i] = Integer.parseInt(c[i]);
        }
        
        int ans = 0;
        for (int i = 0; i < v.length; i++) {
            if (vs[i] > cs[i]) {
                ans += vs[i] - cs[i];
            }
        }
        
        
        System.out.println(ans);
    }
}



