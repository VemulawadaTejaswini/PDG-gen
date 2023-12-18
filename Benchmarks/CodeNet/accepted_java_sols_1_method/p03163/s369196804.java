import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt(), W = sc.nextInt();
        int[] v = new int[N + 1], w = new int[N + 1];
        long[] f = new long[W  + 1];

        for(int i = 1; i <= N; i ++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
        }
        for(int i = 1; i <= N; i++){
            for(int j = W; j >= v[i]; j --){
                f[j] = Math.max(f[j],f[j - v[i]] + w[i]);
            }
        }
        System.out.println(f[W]);
    }
}