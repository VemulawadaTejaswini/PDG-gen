import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt() - (i+1);
        }
        sc.close();
        Arrays.sort(A);
        int med = N % 2 == 0 ? N/2 -1 : N/2;
        int b = A[med];
        long ans = 0;
        for(int a : A){
            ans += Math.abs(a - b);
        }

        System.out.println(ans);
    }

}
