import java.util.Scanner;

public class Main {
    static int N;
    static int[] result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        result = new int[N+1];
        f(N);

        for(int i = 1; i <= N; i++) {
            System.out.println(result[i]);
        }
    }
    static void f(int n) {

        for(int i = 1; i <= 101; i++) {
            for(int j = 1; j <= 101; j++) {
                for(int k = 1; k <= 101; k++) {
//                    if(i*i + j*j + k*k + i*j + i*k + j*k == n) {
//                        ++result[n];
//                    }
                    n=i*i + j*j + k*k + i*j + i*k + j*k;
                    if(n>N) break;
                    ++result[n];
                }
            }
        }
    }
}
