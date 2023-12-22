import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int A = scan.nextInt();
        int B = scan.nextInt();
        int answer = 0;
        for (int i = 0; i < 2; i++) {
            if (A < B) {
                answer += B;
                B -= 1;
            } else {
                answer += A;
                A -= 1;
            }
        }
        System.out.println(answer);
    }
}
