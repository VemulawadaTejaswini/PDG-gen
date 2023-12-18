import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }
 
        System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        for (int j = 1; j < A.length; j++) {
            int key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i];
                i--;
            }
            A[i + 1] = key;
            System.out.println(Arrays.toString(A).replaceAll("[,\\[\\]]", ""));
        }
    }
}