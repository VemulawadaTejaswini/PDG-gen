
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        int k = in.nextInt();
        int result = 0;
        while (n > 0) {
            n /= k;
            result += 1;
        }
        System.out.println(result);
    }
}
