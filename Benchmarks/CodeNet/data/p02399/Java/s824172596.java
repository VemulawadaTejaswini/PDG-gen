import java.util.*;
import java.math.BigDecimal;
public class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int d = a / b;
	int r = a % b;
	float a_f = (float)a;
	float b_f = (float)b;
	float f =  a_f / b_f ;
			int x = a / b;
		float r_f = (float)r ;
		float y = r_f / b_f;
		
			float z = x + y;
			String str = BigDecimal.valueOf(z).toPlainString();
		BigDecimal bd = new BigDecimal(y);
		if (x > 1){
		BigDecimal bd3 = bd.setScale(6, BigDecimal.ROUND_DOWN); 
			System.out.println(d + " " + r + " " + bd3);} else {BigDecimal bd4 = bd.setScale(6, BigDecimal.ROUND_DOWN); System.out.println(d + " " + r + " " + bd4);} 
		
	}
}
