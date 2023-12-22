import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scan.nextInt();
        for (int i = k; i < n; i++) {
            if (a[i] > a[i - k]) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
