import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        String S = sc.next();
        int c = 1;

        for (int i = 1; i < N; i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                c++;
            }
        }

        System.out.println(c);
    }
}