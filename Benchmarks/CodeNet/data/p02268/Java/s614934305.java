import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int S[] = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int T[] = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < q; i++) {
            int result = binarySearch(S, T[i]);
            if(result != -1){
                count++;
            }
        }
        System.out.println(count);

    }

    public static int binarySearch(int[] A, int x) {
        int left = 0;
        int right = A.length;
        int mid;

        while (left < right) {
            mid = (left + right) / 2;
            if (A[mid] == x) {
                return mid;
            } else if (x < A[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
