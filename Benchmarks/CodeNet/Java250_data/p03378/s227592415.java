import java.util.Scanner;

public class Main {
    //B - Toll Gates
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int X = scanner.nextInt();
        int[] A = new int[100];
        for(int i = 0; i < M; i++) {
            int m = scanner.nextInt();
            A[m] = 1;
        }
        int cost1 = 0;
        for(int i = 0; i < X; i++) {
            cost1 += A[i];
        }

        int cost2 = 0;
        for(int i = X; i < N; i++) {
            cost2 += A[i];
        }
        System.out.println(Math.min(cost1, cost2));
    }
}
