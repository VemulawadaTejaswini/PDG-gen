import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //dream dreamer erase eraser
        int A;
        int B;
        int C;
        int D;
        try (Scanner sc = new Scanner(System.in)) {
            A = sc.nextInt();
            B = sc.nextInt();
            C = sc.nextInt();
            D = sc.nextInt();

        }
        if (B < C || D < A) {
            System.out.println("0");
        } else {
            int start = Math.max(A, C);
            int end = Math.min(B, D);
            System.out.println(end - start);
        }

    }

}
