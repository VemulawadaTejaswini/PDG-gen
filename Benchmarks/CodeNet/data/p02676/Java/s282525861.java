import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int K = s.nextInt();
        final String S = s.next();

        if (S.length() <= K) {
            System.out.println(S);
        } else {
            System.out.println(S.substring(0, K) + "...");
        }
    }
}