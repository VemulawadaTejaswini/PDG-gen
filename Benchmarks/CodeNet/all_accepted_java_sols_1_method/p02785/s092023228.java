import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        if(N <= K){
            System.out.println(0);
            return;
        }
        long[] H = new long[N];
        long sum = 0;
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextLong();
            sum+= H[i];
        }
        Arrays.sort(H);
        int k = H.length -1;
        while (0 < K ){
            sum = sum - H[k];
            k--;
            K--;
        }
        System.out.println(sum);
    }
}