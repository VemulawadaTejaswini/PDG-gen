import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long R = scan.nextLong();
        long D = scan.nextLong();
        long x = scan.nextLong();
        for (int i = 0; i < 10; i++) {
            x = R * x - D;
            System.out.println(x);
        }
    }
}
