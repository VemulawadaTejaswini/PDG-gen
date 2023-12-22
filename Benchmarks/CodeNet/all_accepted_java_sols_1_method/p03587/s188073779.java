import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.next();
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '1') ans++;
        }

        System.out.println(ans);
    }
}
