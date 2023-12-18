import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        final long N = scn.nextInt();
        long tmp = N;
        long start = 1;
        long end = c(N);
        long calc = xx( start, end);

        for (;;) {
            if (calc < tmp) {
                end++;
                calc += end;
            } else if (calc > tmp) {
                tmp += N;
                tmp -= calc;

                start = end+1;
                end = end+1;
                calc = xx(start, end);
            } else {
                System.out.println(end);
                break;
            }
        }
    }

    private static long c(long N) {
        int keta = String.valueOf( N ).length();
//        long k = Math.round(Math.sqrt(N*2.0));
//        k -= 3;
//        if (k % 2 != 0) {
//            k--;
//        }
        
        return keta * 5;
    }

    private static long xx(long start, long end) {
        return (end - start + 1) * (start + end) / 2;
    }
}
