import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, i;
        n = cin.nextInt();
        int[] A = new int[n];
        for (i = 0; i < n; i++) {
            A[i] = cin.nextInt();
        }
        
        insertionSort(A, n);
    }
    static void insertionSort(int[] A, int n) {
        int i, j, v;
        for (i = 0; i < n; i++) {
            v = A[i];
            for (j = i - 1; j >= 0 && A[j] > v; j--) {
                A[j + 1] = A[j];
            }
            A[j + 1] = v;
            printArray(A, n);
        }
    }
    static void printArray(int[] A, int n) {
        int i;
        for (i = 0; i < n - 1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println(A[i]);
    }
}
