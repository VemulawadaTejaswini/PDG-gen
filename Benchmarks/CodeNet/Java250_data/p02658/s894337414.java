import java.util.*;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        BigInteger result = new BigInteger("1");
        List<String> aList = new ArrayList<String>();

        for (int i = 0 ; i < N ; i++) {
            aList.add(s.next());
        }

        if (aList.contains("0")) {
            System.out.println(0);
            return;
        }

        for (String aStr : aList) {
            if (result.multiply(new BigInteger(aStr)).compareTo(new BigInteger("1000000000000000000")) > 0)  {
                System.out.println(-1);
                return;
            }
            result = result.multiply(new BigInteger(aStr));
        }
        System.out.println(result);
    }
}