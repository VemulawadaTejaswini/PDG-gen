import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int max, min, sum = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }

        max = a[0];
        min = a[0];

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            } else if (min > a[i]) {
                min = a[i];
            }
            sum += a[i];
        }
        System.out.print(min + " " + max + " " + sum);
    }
}