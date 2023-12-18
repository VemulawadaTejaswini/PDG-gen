import java.util.*;
import java.math.*;

class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            BigInteger a = new BigInteger(sc.next());
            String ans = a.add(new BigInteger(sc.next())).toString();
            if (ans.length() > 80) {
                System.out.println("overflow");
            } else {
                System.out.println(ans);
            }
        }
    }
}