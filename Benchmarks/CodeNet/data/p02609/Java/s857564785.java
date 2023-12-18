import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String X = sc.next();
        for (int i = 0; i < N; i++) {
            char[] ca = X.toCharArray();
            ca[i] = ca[i] == '0' ? '1' : '0';
            long n = Long.parseLong(new String(ca), 2);

            int count = 1;
            long res = popcount(n);
            while (0 < n % res) {
                count++;
                n %= res;
                res = popcount(n);
            }
            System.out.println(count);

        }

    }

    private static int popcount(long n) {
        String bin = Long.toBinaryString(n);
        char[] ca = bin.toCharArray();
        int pc = 0;
        for (int j = 0; j < ca.length; j++) {
            pc += ca[j] == '1' ? 1 : 0;
        }
        return pc;
    }
}