import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        Integer[] hs = new Integer[n];
        for (int i = 0; i < n; i++) {
            hs[i] = std.nextInt();
        }

        Arrays.sort(hs, Comparator.reverseOrder());
        long count = 0;
        for (int i = k; i < hs.length; i++) {
            count += hs[i];
        }

        System.out.println(count);
    }
}
