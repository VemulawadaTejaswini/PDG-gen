import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int answer = 0;
        while (n!=1) {
            answer += 1;
            n /= 2;
        }
        System.out.println((int) Math.pow(2,answer));
    }
}
