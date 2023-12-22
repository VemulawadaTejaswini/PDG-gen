import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();

        String newS = "";
        for (int n = 0; n < N; n += 1) {
            if (n == K - 1) {
                newS += S.substring(n, n + 1).toLowerCase();
            } else {
                newS += S.substring(n, n + 1);
            }
        }

        System.out.println(newS);
    }
}
