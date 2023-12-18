import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long[] A = new long[N];
        boolean flg = false;
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextLong();
            if(A[i] == 0) flg = true;
        }
        if(flg) {
            System.out.println(0);
            return;
        }
        BigDecimal sum = new BigDecimal(A[0]);
        for(int i = 1; i < N; i++) {
            sum = sum.multiply(new BigDecimal(A[i]));
            if(sum.compareTo(new BigDecimal("1000000000000000000") ) > 0 ){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(sum);
    }
}
