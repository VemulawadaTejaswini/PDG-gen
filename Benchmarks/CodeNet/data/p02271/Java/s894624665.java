import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int m = sc.nextInt();
            boolean answer = rec(0, m, A, n);
            if (answer) System.out.println("yes"); 
            else System.out.println("no"); 
        }
        sc.close();
    }
    public static boolean rec (int i, int m, int[] A, int n) {
        if (m == 0) return true;
        if (i >= n) return false;
        boolean res = rec(i + 1, m, A, n) || rec(i + 1, m - A[i], A, n);
        return res;
    }
}
