import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            final int K = s.nextInt();
            final String S = s.next();
            System.out.println(S.length() > K ? S.substring(0, K) + "..." : S);
        }
    }
}
