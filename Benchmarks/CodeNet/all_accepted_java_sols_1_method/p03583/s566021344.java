import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long h = 1;
        long n = 1;
        long w = 1;
        boolean found = false;
        for (int i = 3500; i > 0; i--) {
            for (int j = 3500; j > 0; j--) {
                long k1 = N * i * j;
                long k2 = 4 * i * j - N * (i + j);
                if (k2 > 0 && k1 % k2 == 0) {
                    h = i;
                    n = j;
                    w = k1 / k2;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        StringJoiner sj = new StringJoiner(" ");
        sj.add(String.valueOf(h));
        sj.add(String.valueOf(n));
        sj.add(String.valueOf(w));
        System.out.println(sj);
    }

}
