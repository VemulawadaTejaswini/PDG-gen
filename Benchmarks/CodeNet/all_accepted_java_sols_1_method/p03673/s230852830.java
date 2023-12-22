import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int i;
        for (i = n - 1; i >= 0; i -= 2) {
            System.out.print(a[i] + " ");
        }
        if (i == -2) i = 0;
        for (i = i + 1; i < n - 1; i += 2) {
            System.out.print(a[i] + " ");
        }
    }
}
