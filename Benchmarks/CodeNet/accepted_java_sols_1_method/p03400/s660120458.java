import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int D = scan.nextInt();
        int X = scan.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }
        int answer = 0;
        for (int i = 0; i < N; i++) {
            answer += (D-1)/A[i]+1;
        }
        answer += X;
        System.out.println(answer);
    }
}