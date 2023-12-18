import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] C = new int[N - 1];
        int [] S = new int[N - 1];
        int [] F = new int[N - 1];
        for (int i = 0 ; i < N - 1 ; i++) {
            C[i] = sc.nextInt();
            S[i] = sc.nextInt();
            F[i] = sc.nextInt();
        }
        for (int i = 0 ; i < N - 1 ; i++) {
            int t = 0;
            for (int j = i ; j < N - 1; j++) {
                if (t < S[j]) {
                    t = S[j];
                    t += C[j];
                } else {
                    while (t % F[j] != 0) {
                        t++;
                    }
                    t += C[j];
                }
            }
            System.out.println(t);
        }
        System.out.println(0);

    }

}