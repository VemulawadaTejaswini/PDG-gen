import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int X = scan.nextInt();
        int t = scan.nextInt();
        if (X < t) {
            System.out.println(0);
        } else {
            System.out.println(X-t);
        }
    }
}
