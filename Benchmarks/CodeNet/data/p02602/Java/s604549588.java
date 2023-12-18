import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = k; i < n; i++) {
            if (a[i] > a[i - k]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}