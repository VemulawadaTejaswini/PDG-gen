import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        double bunbo = 0;
        for (int i = 0; i < n; i++) {
            bunbo += 1.0 / a[i];
        }
        double ans = 1 / bunbo;
        System.out.println(ans);
    }

}
