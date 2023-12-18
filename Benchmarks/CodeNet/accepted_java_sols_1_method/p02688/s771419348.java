import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();
        int d[] = new int[K];
        int A[] = new int[N];

        for (int i = 0; i < K; i++) {
            d[i] = s.nextInt();
            for (int j = 0; j < d[i]; j++) {
                int num = s.nextInt();
                A[num - 1] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!(A[i] == 1)) {
                count++;
            }
        }
        System.out.println(count);

        s.close();
    }
}