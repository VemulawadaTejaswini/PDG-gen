
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] n = new int[in.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }
        Arrays.sort(n);
        final int left = n[n.length / 2 - 1];
        final int right = n[n.length / 2];
        if (left == right) {
            System.out.println(0);
            return;
        }
        System.out.println(right - left);
    }
}
