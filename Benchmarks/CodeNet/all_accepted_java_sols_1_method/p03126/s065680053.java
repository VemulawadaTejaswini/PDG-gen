import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][];
        int[] bit = new int[N];
        for (int i = 0; i < A.length; i++) {
            int K = sc.nextInt();
            A[i] = new int[K];
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
                bit[i] |= (1 << (A[i][j] - 1));
            }
        }
        int res = bit[0];
        for (int i = 1; i < bit.length; i++) {
            res &= bit[i];
        }
        System.out.println(Integer.bitCount(res));
        sc.close();
    }
}