import java.util.*;
import java.io.*;
public class Main {

    int count = 0;
    public static void main(String[] args) {
        new Main().runner();
    }

    public void runner() {
        Scanner in = new Scanner(System.in);
        int n=Integer.parseInt(in.next());
        int A[] = new int[n];
        for(int i=0; i<n; i++) {
            A[i] = Integer.parseInt(in.next());
        }
        MergeSort(A, 0, n);
        System.out.print(A[0]);
        for (int i = 1; i < n; i++) {
            System.out.print(" " +A[i]);
        }
        System.out.println();
        System.out.println(count);
        
    }

    public void Merge(int[] A, int left,int  mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];
        for (int i = 0; i < n1; i++) {
            l[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            r[i] = A[mid + i];
        }
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;

        int L = 0;
        int R = 0;
        for (int k = left; k < right; k++) {
            if (l[L] <= r[R]) {
                A[k] = l[L++];
            } else {
                A[k] = r[R++];
            }
            count++;
        }
    }


    public void MergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            MergeSort(A, left, mid);
            MergeSort(A, mid, right);
            Merge(A, left, mid, right);
        }
    }
}
