import java.math.BigDecimal;
        import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal result = BigDecimal.valueOf(1);

        for (int i=0;i<n;i++){
            BigDecimal input = sc.nextBigDecimal();
            if (input == BigDecimal.valueOf(0)) { result = BigDecimal.valueOf(0); break;}

            if (result.multiply(input).compareTo(BigDecimal.valueOf(1000000000000000000L)) == 1 || result.compareTo(BigDecimal.valueOf(-1)) == 0) {
                result = BigDecimal.valueOf(-1);
            } else {
                result = result.multiply(input);
            }
        }

        System.out.println(result.toBigInteger());
    }
}
