import java.util.*;

public class Main {
    static boolean solve(int i, int m, int n, int A[]) {
        if(m == 0) return true;
        if(i >= n) return false;
        return solve(i + 1, m, n, A) || solve(i + 1, m - A[i], n, A);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A;
        A = new int[n]; 
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++) {
            int m = sc.nextInt();
            if(solve(0, m, n, A)) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
