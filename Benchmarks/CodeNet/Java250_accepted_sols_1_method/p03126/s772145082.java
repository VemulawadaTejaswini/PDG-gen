import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] k = new int[n];
        int[] c = new int[m + 1];
        for (int i = 0; i < n; i++) {
            k[i] = sc.nextInt();
            for (int j = 0; j < k[i]; j++) {
                int d = sc.nextInt();
                c[d]++;
            }
        }
        int ans = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] == n) ans++;
        }
        System.out.println(ans);
    }
}