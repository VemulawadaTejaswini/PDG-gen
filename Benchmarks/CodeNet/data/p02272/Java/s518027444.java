import java.util.Scanner;

public class Main {
    private static int merge (int A[], int left, int mid, int right) {
        int cnt = 0;
        int n1 = mid - left;
        int n2 = right - mid;
        int L[] = new int[n1+1], R[] = new int[n2+1];
        for (int i = 0; i < n1; i++)
            L[i] = A[left + i];
        L[n1] = Integer.MAX_VALUE;
        for (int i = 0; i < n2; i++)
            R[i] = A[mid + i];
        R[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        for (int k = left; k < right; k++) {
            cnt++;
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
        }
        return cnt;
    }

    private static int mergeSort(int A[], int left, int right) {
        int cnt = 0;
        if(left + 1 < right) {
            int mid = (left + right) / 2;
            cnt += mergeSort(A, left, mid);
            cnt += mergeSort(A, mid, right);
            cnt += merge(A, left, mid, right);
        }
        return cnt;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, A[], cnt;
        n = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++)
            A[i] = sc.nextInt();
        cnt = mergeSort(A, 0, A.length);
        for (int i = 0; i < n; i++) {
            System.out.print(A[i]);
            if (i != n - 1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(cnt);
    }
}