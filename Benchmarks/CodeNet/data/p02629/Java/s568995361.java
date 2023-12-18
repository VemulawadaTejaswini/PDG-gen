
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = Long.parseLong(scan.next());
        scan.close();

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            long l = n % 26;
            if (l == 0) {
                sb.append('z');
                n -= 1;
            } else {
                char c = 'a';
                c += l - 1;
                sb.append(c);
            }

            n /= 26;
        }

        System.out.println(sb.reverse().toString());
    }

}
