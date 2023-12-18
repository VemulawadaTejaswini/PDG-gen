import java.util.*;

public class Main {
    static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }

    static int bubbleSort(int[] A, int N) {
        int flag = 1;
        int count = 0;
        while(flag == 1) {
            flag = 0;
            for(int j = N-1; j >=1; j--) {
                if(A[j] < A[j-1]) {
                    swap(A, j, j-1);
                    flag = 1;
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = sc.nextInt();

        int c = bubbleSort(a, n);

        System.out.print(a[0]);
        for(int i = 1; i < n; i++) System.out.print(" " + a[i]);
        System.out.println();
        System.out.println(c);
    }
}
