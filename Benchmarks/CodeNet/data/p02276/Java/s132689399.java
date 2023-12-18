

import java.util.Scanner;

public class Main {
    public static int MAX = 100000;
    public static int[] A = new int[MAX];
    public static int n;

    public static int partition(int p, int r) {
        int x = A[r];
        int i = p - 1;
        int t;
        for(int j = p; j < r; j++) {
            if(A[j] <= x)
            {
                i++;
                t = A[i];
                A[i] = A[j];
                A[j] = t;
            }
        }
        t = A[i + 1];
        A[i+1] = A[r];
        A[r] = t;
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int q = partition(0,n-1);
        for(int i = 0; i < n; i++) {
            if(i != 0) System.out.print(" ");
            if(i == q) System.out.print("[");
            System.out.print(A[i]);
            if(i == q) System.out.print("]");
        }
        System.out.println();
    }
    
}

