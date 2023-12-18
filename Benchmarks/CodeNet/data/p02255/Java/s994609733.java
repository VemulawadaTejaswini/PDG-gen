import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] A = convertInt(sc.nextLine().split(" "));
        printA(A);
        insertionSort(A, n);
    }

    static void printA(int[] A) {
        int cnt = 1;
        for (int n : A) {
            System.out.print(n);
            if (cnt < A.length) {
                System.out.print(" ");
            }
            cnt++;
        }
        System.out.println("");
    }

    static int[] convertInt(String[] args) {
        int[] intA = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            intA[i] = Integer.parseInt(args[i]);
        }
        return intA;
    }

    static void insertionSort(int[] A, int n) {
        for (int i = 1; i < n; i++) {
            int v = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > v) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;
            printA(A);
        }
    }
}

