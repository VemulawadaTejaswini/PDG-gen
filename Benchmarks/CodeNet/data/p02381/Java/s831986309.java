import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Main {

    public BigDecimal pow(BigDecimal value) {
        return value.multiply(value);
    }

    public static BigDecimal sqrt(BigDecimal a, int scale){
        BigDecimal x = new BigDecimal(
                Math.sqrt(a.doubleValue()), MathContext.DECIMAL64);
        if(scale < 17) return x;

        BigDecimal b2 = new BigDecimal(2);
        for(int tempScale = 16; tempScale < scale; tempScale *= 2){
            x = x.subtract(
                    x.multiply(x).subtract(a).divide(
                    x.multiply(b2), scale, BigDecimal.ROUND_HALF_EVEN));
        }
        return x;
    }

    public BigDecimal average(int[] values) {
        int sum = 0;
        for (int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return new BigDecimal(sum).divide(new BigDecimal(values.length), 5, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal var(int[] values) {
        BigDecimal sum = BigDecimal.ZERO;
        for (int i=0; i<values.length; i++) {
            sum = sum.add(pow(new BigDecimal(values[i]).subtract(average(values))));
        }

        return sum.divide(new BigDecimal(values.length), 5, BigDecimal.ROUND_HALF_UP);
    }

    public BigDecimal std(int values[]) {
        return sqrt(var(values), 2);
    }

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

        int count = 0;
		
        Main m = new Main();
        while(true) {
        	count = sc.nextInt();
        	if(count == 0) break;
            int[] values = new int[count];
        	for(int i=0; i<count; i++) {
        		values[i] = sc.nextInt();
        	}
        	System.out.println(m.std(values));
        }

        sc.close();
    }
}
