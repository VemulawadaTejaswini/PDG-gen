import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        double c = Double.parseDouble(a + b);
        double sq = Math.sqrt(c);
        double rem = sq % (int) sq;
        if (rem == 0D) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}