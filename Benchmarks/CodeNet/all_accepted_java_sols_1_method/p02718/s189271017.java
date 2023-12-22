import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum+= a[i];
        }

        int th = sum / (4 * m);
        if (sum % (4 * m) != 0) th++;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= th) count++;
        }

        if (count >= m ){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
