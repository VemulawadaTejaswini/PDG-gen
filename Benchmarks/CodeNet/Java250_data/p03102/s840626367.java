import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();

        int[] b = new int[M];
        int[] a = new int[M];

        for (int i =0; i<M; i++) {
            b[i] = sc.nextInt();
        }

        int result = 0;
        for (int i =0; i<N; i++) {
            int temp = 0;

            for (int j =0; j<M; j++) {
                a[j] = sc.nextInt();
                temp += a[j] * b[j];
            }
            if (temp + C > 0) {
                result ++;
            }
        }

        System.out.println(result);
        sc.close();
    }
}