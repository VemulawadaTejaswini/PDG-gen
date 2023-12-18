import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        long sum = Long.parseLong(s);

        for (long i = 1; i < Math.pow(2, s.length() - 1); i++) {
            long nowBit = i;
            int start = 0;
            while (true) {
                long value = Long.lowestOneBit(nowBit);
                if (value == 0) {
                    sum += Long.parseLong(s.substring(start));
                    break;
                }
                int index = (int)(Math.log(value) /  Math.log(2)) + 1;
                sum += Integer.parseInt(s.substring(start, index));
                start = index;
                nowBit -= value;
            }
        }

        System.out.println(sum);
    }
}
