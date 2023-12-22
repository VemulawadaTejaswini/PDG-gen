import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            int k = s.nextInt();
            int a = s.nextInt();
            int b = s.nextInt();
            int mod = a % k;
            int d = b - a;
            System.out.println((mod == 0 || (k - mod) <= d) ? "OK" : "NG");
        }
    }
}
