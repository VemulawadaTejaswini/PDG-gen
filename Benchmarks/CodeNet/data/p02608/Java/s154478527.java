import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.println(f(i));
        }
    }
    static int f(int n) {
        int res = 0;

        for(int i = 1; i <= 101; i++) {
            for(int j = 1; j <= 101; j++) {
                for(int k = 1; k <= 101; k++) {
                    if(n>N) break;
                    if(i*i + j*j + k*k + i*j + i*k + j*k == n) res++;
                }
            }
        }
        return res;
    }
}
