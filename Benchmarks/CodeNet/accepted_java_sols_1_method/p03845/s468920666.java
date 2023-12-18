import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
            sum += t[i];
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int p = sc.nextInt() - 1;
            int x = sc.nextInt();
            System.out.println(sum - t[p] + x);
        }

        sc.close();
    }
}