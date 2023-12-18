import java.util.*;

public class Main {
    long MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 1; i < n - 1; i++) {
            int[] pp = new int[3];
            for(int j = 0; j < 3; j++) {
                pp[j] = p[i - 1 + j];
            }
            Arrays.sort(pp);
            if(pp[1] == p[i]) ans++;
        }

        System.out.println(ans);

    }
}