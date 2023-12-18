import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            System.out.println(f(i));
        }
    }
    static int f(int n) {
        int res = 0;

        for(int i = 1; i*i <= n; i++) {
            for(int j = 1; j*j <= n; j++) {
                for(int k = 1; k*k <= n; k++) {
                    if(i*i + j*j + k*k + i*j + i*k + j*k == n) res++;
                }
            }
        }
        return res;
    }
}
