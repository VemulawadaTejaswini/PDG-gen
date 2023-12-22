import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] c = new int[n];
        int[] s = new int[n];
        int[] f = new int[n];
        
        for (int i = 0; i < n-1; i++) {
            String[] line = br.readLine().split(" ");
            c[i+1] = Integer.parseInt(line[0]);
            s[i+1] = Integer.parseInt(line[1]);
            f[i+1] = Integer.parseInt(line[2]);
        }
        
        int ans = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (ans <= s[j]) {
                    ans += s[j] - ans;
                }
                else if ((ans - s[j]) % f[j] == 0) {
                    
                }
                else {
                    ans += f[j] - ((ans - s[j])%f[j]);
                }
                ans += c[j];
            }
            System.out.println(ans);
            ans = 0;
        }
        System.out.println(0);
    }
}



