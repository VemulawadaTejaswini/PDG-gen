import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String x = scanner.next();
        String y = scanner.next();

        BigInteger X = new BigInteger(x);
        BigInteger Y = new BigInteger(y);

        int cnt = 0;
        while(X.compareTo(Y) <= 0){
            X = X.multiply(new BigInteger("2"));
            cnt++;
        }

        System.out.println(cnt);
    }
}
