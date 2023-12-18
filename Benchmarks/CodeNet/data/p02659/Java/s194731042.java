import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong();
        double B = sc.nextDouble();

        int B_100 = (int) (B*100);

        long tmp = A*B_100;

        String tmpStr = Long.toString(tmp);
        int length = tmpStr.length();

        String result;
        if(length >= 2) {
            result = tmpStr.substring(0, length-2);
        }else {
            result = "0";
        }

        System.out.println(result);
    }
}