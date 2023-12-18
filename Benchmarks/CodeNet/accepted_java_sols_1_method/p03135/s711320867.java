import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int T = scan.nextInt();
        int X = scan.nextInt();
        double answer = (double) T/X;
        System.out.printf("%.9f", answer);
    }
}
