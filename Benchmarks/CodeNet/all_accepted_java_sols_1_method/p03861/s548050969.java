import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long a = scan.nextLong();
        long b = scan.nextLong();
        long x = scan.nextLong();
        long answer = b / x + 1;
        if (a != 0) {
            answer -= (a - 1) / x + 1;
        }
        System.out.println(answer);
    }
}
