import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            long n = s.nextLong();
            StringBuilder sb = new StringBuilder();
            
            while (n > 0) {
                n--;
                long r = n % 26;
                n = n / 26;
                sb.append((char)('a' + r));
            }
            System.out.println(sb.reverse().toString());
        }
    }
}
