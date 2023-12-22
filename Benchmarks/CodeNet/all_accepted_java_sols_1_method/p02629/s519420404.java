import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> alp = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z");
        long n = sc.nextLong();
        int a = 0;
        for (int i = 1; i <= 26; i++) {

            long pow = (long) Math.pow(26, i);
            long sub = 0;
            if (n <= pow) {
                a = i;
                break;
            } else {
                sub += pow;
            }
            n = n - sub;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < a; i++) {
            long pow = (long) Math.pow(26, a - i);
            long sub = 0;
            for (int j = 1; j <= 26; j++) {
                if (n <= pow * j) {
                    sb.append(alp.get(j - 1));
                    break;
                } else {
                    sub += pow;
                }
            }
            n = n - sub;
        }
        sb.append(alp.get((int) (n - 1)));
        System.out.println(sb.toString());
    }
}
