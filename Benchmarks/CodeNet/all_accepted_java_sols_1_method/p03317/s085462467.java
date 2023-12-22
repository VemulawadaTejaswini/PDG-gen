import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double N = scanner.nextInt();
        double K = scanner.nextInt();
//        int[] as = new int[N];
//        int index1 = 0;
//        for (int i = 0; i < N; i++) {
//            as[i] = scanner.nextInt();
//            if (as[i] == 1) {
//                index1 = i;
//            }
//        }

        int ans = 0;
        ans = (int) Math.ceil((N - K) / (K - 1)) + 1;
//        if (K > N / 2) {
//            ans = 2;
//            System.out.println(ans);
//            return;
//        }
//        if (N % 2 != 0) {
//            N -= 1;
//        }
//        if (N % 2 == 0) {
//            ans = N / 2 - K + 3;
//        }
        System.out.println(ans);
    }
}
