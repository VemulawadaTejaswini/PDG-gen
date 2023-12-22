import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner s = new Scanner(System.in)) {
            char[] L = s.next().toCharArray();

            long ans = 1;
            long san = 1;
            for (int i = L.length - 1; i >= 0; i--) {
                if (L[i] == '1') {
                    ans = (ans * 2 + san) % 1000000007;
                }
                san = san * 3 % 1000000007;
            }

            System.out.println(ans);
        }
    }

}
