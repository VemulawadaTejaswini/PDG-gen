import java.util.Scanner;
import java.math.BigDecimal;

public class Main{
	static double a,b,c,d,e,f,X,Y;
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			e = sc.nextInt();
			f = sc.nextInt();		//1??\?????????????????????????????????
			X = ((((c*e)/b)-f)/(((a*e)/b)-d));
			Y = ((f-((c*d)/a))/(e-((b*d)/a)));
			BigDecimal XX = new BigDecimal(X);
			BigDecimal YY = new BigDecimal(Y);
			BigDecimal XXX = XX.setScale(3, BigDecimal.ROUND_HALF_UP);
			BigDecimal YYY = YY.setScale(3, BigDecimal.ROUND_HALF_UP);
			System.out.println(XXX + " " + YYY);
		}
		sc.close();
	}
}