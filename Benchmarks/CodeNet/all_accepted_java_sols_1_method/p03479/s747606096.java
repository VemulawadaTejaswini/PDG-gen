import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        int result = 1;
        long current = x;
        while(current <= y) {
            current = current * 2;
            if(current <= y) {
                result++;
            }
        }
        System.out.println(result);
    }
}