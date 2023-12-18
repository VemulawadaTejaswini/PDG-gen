
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = in.nextInt();
        }
        int result = 0;
        for (int i = 1; i < n - 1; i++) {
            result += Math.min(b[i], b[i - 1]);
        }
        result += b[0];
        result += b[n-2];
        System.out.println(result);
    }
}
