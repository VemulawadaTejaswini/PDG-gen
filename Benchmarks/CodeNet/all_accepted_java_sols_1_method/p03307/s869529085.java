import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long N = scan.nextLong();
        if (N <= 2) {
            System.out.println(2);
        } else if (N % 2 == 0) {
            System.out.println(N);
        } else {
            System.out.println(N * 2);
        }
    }
}
