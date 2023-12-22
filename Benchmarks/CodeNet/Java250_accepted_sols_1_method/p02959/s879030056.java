import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N+1];

        for (int i=0;i<N+1;i++) {
            A[i] = sc.nextInt();
        }

        long ans = 0;
        for (int i=0;i<N;i++) {
            int Bi = sc.nextInt();
            if (A[i] >= Bi) {
                ans += Bi;
            } else {
                ans += A[i];
                Bi -= A[i];
                if (A[i+1] >= Bi) {
                    ans += Bi;
                    A[i+1] -= Bi;
                } else {
                    ans += A[i+1];
                    A[i+1] = 0;
                }
            }
        }
        System.out.println(ans);
    }
}
