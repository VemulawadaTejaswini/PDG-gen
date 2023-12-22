import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            max += a[i];
        }
        sc.close();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (((double)max) / (4 * m) <= a[i]) {
                count++;
            }
        }

        if (count >= m) {
            System.out.println("Yes");

        } else {
            System.out.println("No");

        }
    }
}
