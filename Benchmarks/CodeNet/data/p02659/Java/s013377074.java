import java.util.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        BigDecimal C = new BigDecimal(String.valueOf(A));
        BigDecimal D = new BigDecimal(String.valueOf(B));
		//BigDecimal E = C.setScale(0, RoundingMode.DOWN);
		        BigDecimal G = new BigDecimal(String.valueOf(C.multiply(D)));

		BigDecimal F = G.setScale(0, RoundingMode.DOWN);
		//System.out.println(ans2);
		//System.out.println(max2);
        System.out.println(F.toPlainString());
    }
}
