import java.util.Scanner;

public class Main {
    
    static final int MAX = 200000;
    static final int SENTINEL = 2000000000;
    static int[] L = new int[MAX/2 + 2];
    static int[] R = new int[MAX/2 + 2];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[MAX];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        long ans = mergeSort(a, n, 0, n);
        
        System.out.println(ans);
    }

    private static long mergeSort(int[] a, int n, int left, int right) {
        // TODO 自動生成されたメソッド・スタブ
        int mid = 0;
        long v1, v2, v3 = 0;
        if (left + 1 < right) {
            mid = (left + right) / 2;
            v1 = mergeSort(a, n, left, mid);
            v2 = mergeSort(a, n, mid, right);
            v3 = merge(a, n, left, mid, right);
            return v1 + v2 + v3;
        }
        return 0;
    }

    private static long merge(int[] a, int n, int left, int mid, int right) {
        // TODO 自動生成されたメソッド・スタブ
        int i, j, k;
        long count = 0;
        int n1 = mid - left;
        int n2 = right - mid;
        
        for (i = 0; i < n1; i++)
            L[i] = a[left + i];
        for (i = 0; i < n2; i++)
            R[i] = a[mid + i];
        L[n1] = R[n2] = SENTINEL;
        i = j = 0;
        
        for (k = left; k < right; k++) {
            if (L[i] <= R[j]) {
                a[k] = L[i++];
            } else {
                a[k] = R[j++];
                count += n1 - i; // = mid + j - k - 1
            }
        }
        return count;
    }
}
