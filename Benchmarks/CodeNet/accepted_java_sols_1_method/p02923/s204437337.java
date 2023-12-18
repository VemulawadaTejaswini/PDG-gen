
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        int current = in.nextInt();
        int count = 0;
        int result = 0;
        for (int i = 1; i < n; i++) {
            final int next = in.nextInt();
            if (current >= next) {
                count++;
                result = Math.max(result, count);
            } else {
                count = 0;
            }
            current = next;
        }
        System.out.println(result);
    }
}
