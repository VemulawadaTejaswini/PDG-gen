import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i < n; i++) {
        	int num = sc.nextInt();
        	new BigDecimal(num);
        	BigDecimal gyaku =  new BigDecimal(1).divide(new BigDecimal(num), 10, BigDecimal.ROUND_DOWN);
        	sum = sum.add(gyaku);
		}
        System.out.println(new BigDecimal(1).divide(sum, 10, BigDecimal.ROUND_DOWN).toString());
    }
}
