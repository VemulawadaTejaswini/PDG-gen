import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        // int[] s = new int[n];

        // for (int i = 0; i < n; i++) {
        // s[i] = Integer.parseInt(sc.next());

        // }
        System.out.println(n * (n - 1) / 2 + m * (m - 1) / 2);

        sc.close();
    }
}