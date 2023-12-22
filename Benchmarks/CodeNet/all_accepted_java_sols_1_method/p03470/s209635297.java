import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        Arrays.sort(a);
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                count++;
            }
        }

        System.out.println(count);
    }
}