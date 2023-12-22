import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int res = Integer.MAX_VALUE;
        int[] X = new int[N];
        for(int i = 0; i < N; i++) X[i] = sc.nextInt();

        for(int i = 1; i <= 100; i++) {
            int tmp = 0;
            for(int j = 0; j < N; j++) {
                tmp += (int)Math.pow(Math.abs(X[j]-i), 2);
            }
            res = Math.min(res, tmp);
        }
        System.out.println(res);
    }
}
