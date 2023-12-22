import java.util.Arrays;
import java.util.Scanner;
 
// 絶対値の和の最小値
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
            B[i] = A[i] - i;
        }
        Arrays.sort(B);
        int x = B[N/2];
 
        long res = 0;
        for(int j = 0; j < N; j++) {
            res += Math.max(-x+B[j],x-B[j]);
        }
        System.out.println(res);
    }
}