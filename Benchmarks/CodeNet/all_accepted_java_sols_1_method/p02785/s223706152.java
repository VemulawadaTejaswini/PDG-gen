import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] h = new int[n];
        for(int i=0; i<n; i++) {
            h[i] = in.nextInt();
        }
        Arrays.sort(h);
        long count = 0;
        for(int i=0; i<n-k; i++) {
            count += h[i];
        }
        System.out.println(count);
    }
}
