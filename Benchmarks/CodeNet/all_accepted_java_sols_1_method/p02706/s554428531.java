import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] A = new int[M];
        for(int i = 0; i < A.length; i++) {
            A[i] = scanner.nextInt();
            N -= A[i];
        }

        if(N >= 0) {
            System.out.println(N);
        } else {
            System.out.println(-1);
        }
    }
}