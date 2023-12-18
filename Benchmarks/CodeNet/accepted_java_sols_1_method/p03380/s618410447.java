import java.util.*;

public class Main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        System.out.print(a[n - 1] + " ");

        int r = a[0];
        for (int i = 1; i < a.length; i++) {
            if (Math.abs(a[n-1] - 2 * a[i]) < Math.abs(a[n-1] - 2 * r)) {
                r = a[i];
            }
        }

        System.out.println(r);
    }
}