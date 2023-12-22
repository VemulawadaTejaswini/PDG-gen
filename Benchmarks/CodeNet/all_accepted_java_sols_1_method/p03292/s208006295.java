import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        int[] abs = new int[3];
        int k = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                abs[k] = Math.abs(A[j] - A[i]);
                k++;
            }
        }
        Arrays.sort(abs);
        System.out.println(abs[0] + abs[1]);
        sc.close();
    }
}