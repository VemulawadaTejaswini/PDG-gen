import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N+2];
        A[0] = 0;
        A[N+1] = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = scan.nextInt();
        }
        long answer = 0;
        for (int i = 1; i <= N+1; i++) {
            answer += Math.abs(A[i] - A[i-1]);
        }
        for (int i = 1; i <= N; i++) {
            int x = Math.abs(A[i]   - A[i-1]) + Math.abs(A[i+1] - A[i]);
            int y = Math.abs(A[i+1] - A[i-1]);
            System.out.println(answer - (x-y));
        }
    }
}