import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; ++i) {
            a[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int counter = 0;
        int m = 0;

        for (int i=0; i<q; ++i) {
            m = sc.nextInt();
            if (Arrays.binarySearch(a, m) >= 0) {
                counter += 1;
            }
        }
        System.out.println(counter);
    }
}
