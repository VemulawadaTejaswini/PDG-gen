import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
//        long[] A = new long[N];
        long sum = scanner.nextLong();
        for(int i = 1; i < N; i++) {
            sum = sum * scanner.nextLong();
        }
        if(sum > 1000000000000000000L){
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
    }
}
