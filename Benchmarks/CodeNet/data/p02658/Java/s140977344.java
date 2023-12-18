import java.util.*;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        long result = 1;
        List<Long> aList = new ArrayList<Long>();

        for (int i = 0 ; i < N ; i++) {
            aList.add(s.nextLong());
        }

        if (aList.contains(0)) {
            System.out.println(0);
            return;
        }
        
        for (long a : aList) {
            if (result * a > 1000000000000000000l) {
                System.out.println(-1);
                return;
            }
            result *= a;
        }
        System.out.println(result);
    }
}