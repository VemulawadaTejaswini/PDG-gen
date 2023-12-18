import java.util.Scanner;
 
public class Main {
    static final int INF = 2000000000;
 
    static long ans;
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
 
        ans = 0;
        mergeSort(a, 0, n);
 
        System.out.println(ans);
 
        sc.close();
    }
 
    private static void mergeSort(int[] a, int left, int right) {
        if(left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }
 
    private static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
 
        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];
        for(int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }
        for(int i = 0; i < n2; i++) {
            r[i] = a[mid + i];
        }
        l[n1] = INF;
        r[n2] = INF;
 
        int i = 0;
        int j = 0;
        for(int k = left; k < right; k++) {
            if(l[i] < r[j]) {
                ans += j;
                a[k] = l[i];
                i++;
            }else {
                a[k] = r[j];
                j++;
            }
        }
    }
}
