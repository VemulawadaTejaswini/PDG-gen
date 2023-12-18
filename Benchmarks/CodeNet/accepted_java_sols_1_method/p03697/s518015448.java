import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int answer = a + b;
        if (10 <= answer) {
            System.out.println("error");
        } else {
            System.out.println(answer);
        }
    }
}
