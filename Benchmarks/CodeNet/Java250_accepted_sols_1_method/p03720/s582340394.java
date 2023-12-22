import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC061B - Counting Roads

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 2 <= n,m <= 50
        int m = sc.nextInt();

        int[] a = new int[m];   // 1 <= a,b, <= n
        int[] b = new int[m];   // a <> b
        
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        int[] cnt = new int[n];
        for (int j = 0; j < m; j++) {
            for (int k = 0; k < n; k++) {
                if (a[j] == k + 1 || b[j] == k + 1) ++cnt[k];
            }
        }
        
        for (int c : cnt) {
            System.out.println(c);
        }
    }

}