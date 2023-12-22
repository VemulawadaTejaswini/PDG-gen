
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int[] n = new int[in.nextInt()];
        for (int i = 0; i < n.length; i++) {
            n[i] = in.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n.length - 1; ++i) {
            if (n[i] > n[i - 1]) {
                if (n[i + 1] > n[i]) {
                    count++;
                }
            } else if (n[i] < n[i - 1]) {
                if (n[i] > n[i + 1]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
