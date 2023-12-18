import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String S = scan.next();
        char[] data = S.toCharArray();
        int answer = 0;
        int x = 0;
        for (int i = 0; i < N; i++) {
            if (data[i] == 'I') {
                x += 1;
            } else {
                x -= 1;
            }
            answer = Math.max(answer, x);
        }
        System.out.println(answer);
    }
}
