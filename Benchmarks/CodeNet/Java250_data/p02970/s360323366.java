
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int D = scanner.nextInt();
        
        int answer = N / (2 * D + 1);
        if (N % (2 * D + 1) > 0) {
            answer++;
        }

        System.out.println(answer);
    }
}
