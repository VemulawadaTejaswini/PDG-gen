import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] A = new int[M];
        int syukudaiSum = 0;
        for (int i = 0; i<M; i++) {
            A[i] = scanner.nextInt();
            syukudaiSum += A[i];
        }
        if (N - syukudaiSum >= 0) {
            System.out.println(N - syukudaiSum);
        } else {
            System.out.println("-1");
        }
    }
}