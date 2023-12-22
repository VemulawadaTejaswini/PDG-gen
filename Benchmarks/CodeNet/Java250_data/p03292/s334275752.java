import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int[] A = new int[3];
            for (int i = 0; i < 3; i++) {
                A[i] = in.nextInt();
            }

            int min = (int) 1e9;
            min = Math.min(min, Math.abs(A[0] - A[1]) + Math.abs(A[1] - A[2]));
            min = Math.min(min, Math.abs(A[0] - A[2]) + Math.abs(A[2] - A[1]));
            min = Math.min(min, Math.abs(A[1] - A[0]) + Math.abs(A[0] - A[2]));
            min = Math.min(min, Math.abs(A[1] - A[2]) + Math.abs(A[2] - A[0]));
            min = Math.min(min, Math.abs(A[2] - A[0]) + Math.abs(A[0] - A[1]));
            min = Math.min(min, Math.abs(A[2] - A[1]) + Math.abs(A[1] - A[0]));

            System.out.println(min);
        }
    }

}
