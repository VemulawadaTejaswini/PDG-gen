import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger res = new BigInteger("0");

        for(int i = 1; i <= n; i++) {
            if(i % 3 == 0 || i % 5 == 0) continue;
            res = res.add(BigInteger.valueOf(i));
        }

        System.out.println(res);
    }
}