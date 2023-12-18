import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] B = new int[100005];
        int sumA = 0;

        B[0] = 9999999;
        for (int i = 1; i < N; i++) {
            B[i] = sc.nextInt();
        }
        B[N] = 9999999;

        for (int i = 1; i < N + 1; i++) {
            if (B[i - 1] <= B[i]) {
                sumA += B[i - 1];
            } else {
                sumA += B[i];
            }
        }


        System.out.println(sumA);


    }
}



