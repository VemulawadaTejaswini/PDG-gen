import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];
        int[] t = new int[n + 1];
        for(int i = 0; i < m; i++) c[i] = sc.nextInt();
        Arrays.fill(t, 1000000);
        t[0] = 0;
        for(int i = 0; i < m; i++){
            for(int j = c[i]; j <= n; j++){
                t[j] = Math.min(t[j], t[j - c[i]] + 1);
            }
        }
        System.out.println(t[n]);
    }
}
