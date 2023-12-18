import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100003];
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            a[m]++;
            a[m + 1]++;
            a[m + 2]++;
        }
        int ans = 0;
        for (int i = 0; i < 100003; i++) {
            ans = Math.max(ans, a[i]);
        }
        System.out.println(ans);

    }
}