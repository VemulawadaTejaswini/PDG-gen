
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        int result = 0;
        char[] input = in.next().toCharArray();
        for (int i = 0; i < n - 1; i++) {
            if (input[i] == input[i + 1]) {
                result++;
            }
        }

        result += 2 * k;

        System.out.println(Math.min(result, n-1));
    }
}
