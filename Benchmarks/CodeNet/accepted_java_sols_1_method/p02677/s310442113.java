import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int H = s.nextInt();
		int M = s.nextInt();
		
		BigDecimal lenax = BigDecimal.valueOf(A * Math.cos((Math.PI/6) * H + (Math.PI/360) * M));
		BigDecimal lenay = BigDecimal.valueOf(A * Math.sin((Math.PI/6) * H + (Math.PI/360) * M));
		
		BigDecimal lenbx = BigDecimal.valueOf(B * Math.cos((Math.PI/30) * M));
		BigDecimal lenby = BigDecimal.valueOf(B * Math.sin((Math.PI/30) * M));
		
		BigDecimal x = lenax.subtract(lenbx).pow(2);
		BigDecimal y = lenay.subtract(lenby).pow(2);
		
		System.out.println(x.add(y).sqrt(MathContext.DECIMAL128));
    }
}