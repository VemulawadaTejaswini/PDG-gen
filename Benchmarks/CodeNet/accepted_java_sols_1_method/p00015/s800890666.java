import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            String line2 = sc.nextLine();
            BigInteger a = new BigInteger(line1);
            BigInteger b = new BigInteger(line2);
            BigInteger ab = a.add(b);
            String sum = ab.toString();
            if(sum.length() > 80) {
                System.out.println("overflow");
            }else {
                System.out.println(sum);
            }
        }
    }
}

