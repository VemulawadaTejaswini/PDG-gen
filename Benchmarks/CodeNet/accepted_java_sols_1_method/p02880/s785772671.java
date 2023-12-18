import java.math.BigInteger;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger N = new BigInteger(sc.next());
        sc.close();

        boolean b = false;
        for (int i=1; i<10; i++) {
            for (int j=1; j<10; j++) {
                if (N.intValue()==i*j) {
                    b = true;
                    break;
                }
            }
        }

        if (b)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}