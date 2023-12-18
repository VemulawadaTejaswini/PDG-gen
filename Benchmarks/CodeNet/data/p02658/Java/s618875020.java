import java.util.Scanner;

public class Main {

    private static final long max = (long) Math.pow(10, 18);

    private static long solve(long[] in) {
        long res = in[0];
        for (int i = 1; i < in.length; i++) {
            res *= in[i];
            if (res > max)
                return -1;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] input = new long[N];
        boolean hasZero = false;
        for (int i = 0; i < N; i++) {
            input[i] = sc.nextLong();
            if (input[i] == 0) {
                hasZero = true;
            }
        }
        if (hasZero) {
            System.out.println(0);
        } else {
            long res = solve(input);
            System.out.println(res);
        }
    }


}
