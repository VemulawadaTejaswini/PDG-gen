import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        long answer = 1;
        for (int i = 1; i <= N; i++) {
            answer = answer * i % 1000000007;
        }
        System.out.println(answer);
    }
}
