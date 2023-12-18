import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
        }

        int f = 0;
        long tmp1 = 1;
        for(int j = 0; j < K; j++) {
            tmp1 *= A[j+f];
        }
        for(int i = K - 1; i < N-1; i++) {
            long tmp2 = 1;
            for(int j = 0; j < K; j++) {
                tmp2 *= A[j+1+f];
            }
            f++;
            if(tmp1 < tmp2){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            tmp1 = tmp2;
        }
    }
}