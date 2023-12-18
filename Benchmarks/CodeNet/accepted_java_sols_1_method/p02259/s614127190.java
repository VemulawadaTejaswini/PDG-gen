import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int[] A = new int[100];
        int sum = 0;

        int N = num.nextInt();
        for(int i = 0; i < N; i++) {
            A[i] = num.nextInt();    
        }

        for(int i = 0; i < N - 1; i++) {
            for(int j = N - 1; j > i; j--) {
                if(A[j - 1] > A[j]) {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                    sum++;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            System.out.print(A[i]);
            if(i != N - 1) {
                System.out.print(" ");
            }
        }
        System.out.println("\n" + sum);
    }
}
