import java.math.BigDecimal;
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        long n = sc.nextLong();

        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            long remain = n % 26;
            n /= 26;
            char c = remain==0 ? 'z' : (char)(remain+96);
            if (remain==0) n--;
            sb.append(c);
        }

        sb = sb.reverse();

        System.out.print(sb.toString());

    }
}
