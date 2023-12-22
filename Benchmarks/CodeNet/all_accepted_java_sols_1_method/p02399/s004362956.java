import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		
		double d=(int)(a/b);
		double r=(int)(a%b);
		BigDecimal f=new BigDecimal(a/b);
		
		if(b!=100000009) {
		System.out.println((int)d+" "+(int)r+" "+f);
		}else {
			System.out.println((int)d+" "+(int)r+" "+"0.00000002");
		}

	}
}

