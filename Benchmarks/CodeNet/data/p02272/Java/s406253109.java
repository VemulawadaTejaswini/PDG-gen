import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] S = new int[n];
        for (int i = 0; i < n; i++) S[i] = Integer.parseInt(sc.next());

        mergeSort(S, 0, n);

        System.out.println(Arrays.stream(S).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
        System.out.println(count);
    }

    private static void mergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }

    private static void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;

        int[] L = new int[n1+1];
        int[] R = new int[n2+1];

        for (int i = 0; i < n1; i++) L[i] = A[left + i];
        for (int i = 0; i < n2; i++) R[i] = A[mid + i];

        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
            count++;
        }
    }
}

