import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        long n = Long.parseLong(sc.next());
        long k = Long.parseLong(sc.next());
        StringBuilder sb = new StringBuilder();
        while(n > 0L) {
            sb.append(n % k);
            n /= k;
        }
        System.out.println(sb.toString().length());
    }
}