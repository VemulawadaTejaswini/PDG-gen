import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        String op = scan.next();
        int B = scan.nextInt();
        int answer = A + B;
        if ("-".equals(op)) {
            answer = A - B;
        }
        System.out.println(answer);
    }
}
