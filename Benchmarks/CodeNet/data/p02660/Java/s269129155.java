import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long count = 0;

        long v = getCommonDivisor(n, 2);
        if(v == 1){
            System.out.println(1);
            System.exit(0);
        }


        for(long i = 2 ; i <= n ; i++){
            long val = getCommonDivisor(n, i);
            if(val != i){
                continue;
            }
            n = n / val;
            count++;
        }
        System.out.println(count);
    }

    private static long getCommonDivisor(long x, long y) {
        long biggerNum = Math.max(x, y);
        long smallerNum = Math.min(x, y);

        long surplus = biggerNum % smallerNum;

        if (surplus == 0) {
            return smallerNum;
        }
        surplus = getCommonDivisor(smallerNum, surplus);

        return surplus;
    }
}