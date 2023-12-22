import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        if(a < b) gcd(b, a);
        if(b == 0) return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer K = Integer.parseInt(scanner.next());
        Integer total = 0;

        for (int i = 1; i <= K; i++) {
            for (int j = 1; j <= K; j++) {
                for (int k = 1; k <= K; k++) {
                    total += gcd(i, gcd(j,k));
                }
            }
        }
        System.out.println(total);
    }
}
