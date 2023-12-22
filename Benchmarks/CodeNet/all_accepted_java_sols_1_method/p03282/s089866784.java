import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        long k = scanner.nextLong();
        for (int i = 0;i < s.length();++i){
            int a = Integer.valueOf(s.substring(i,i + 1));
            if(a != 1){
                System.out.println(a);
                return;
            }
            else if(k - 1 == i){
                System.out.println(a);
                return;
            }
        }
    }

}


