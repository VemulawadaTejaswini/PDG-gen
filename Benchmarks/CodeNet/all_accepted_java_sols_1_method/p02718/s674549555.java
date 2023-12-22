import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer N = input.nextInt();
        Integer M = input.nextInt();
        Integer[] A = new Integer[N];
        int sum = 0;
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
            sum += A[i];
        }
        Arrays.sort(A, Comparator.reverseOrder());
        if ((A[M-1] * 4 * M) >= sum){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
