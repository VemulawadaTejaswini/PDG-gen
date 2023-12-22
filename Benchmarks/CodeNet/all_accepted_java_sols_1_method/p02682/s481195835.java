import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int K = scanner.nextInt();

        int sum = 0;

        while(0 < A && 0 < K) {
            sum++;
            A--;
            K--;
        }

        while(0 < B && 0 < K) {
            B--;
            K--;
        }

        while(0 < C && 0 < K) {
            sum--;
            C--;
            K--;
        }

        System.out.println(sum);


        
        
    }
}