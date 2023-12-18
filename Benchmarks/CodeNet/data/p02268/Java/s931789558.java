import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n, q, i, count = 0;
        int[] S, T;
        n = cin.nextInt();
        S = new int[n];
        for (i = 0; i < n; i++) {
            S[i] = cin.nextInt();
        }
        q = cin.nextInt();
        T = new int[q];
        for (i = 0; i < q; i++) {
            T[i] = cin.nextInt();
        }
        for (i = 0; i < q; i++) {
            if (bSearch(S, n, T[i]) != -1) {
                count++;
            }
        }
        System.out.println(count);
    }
    static int bSearch(int[] A, int len, int key) {
        int left = 0, right = len, mid;
        while (left < right) {
            mid = (left + right) / 2;
            if (A[mid] == key) 
                return mid;
            if (A[mid] < key) 
                left = mid + 1;
            else 
                right = mid;
        }
        return -1;
    }
}
