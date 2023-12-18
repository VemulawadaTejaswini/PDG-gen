
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        int[] buka = new int[N];
        for (int i = 0; i<N-1; i++) {
            A[i] = scanner.nextInt();
            buka[A[i]-1]++;
        }

        for (int i = 0; i<N; i++) {
           System.out.println(buka[i]);
        }
    }
}
