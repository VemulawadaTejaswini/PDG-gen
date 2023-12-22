import java.util.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		double r=stdIn.nextDouble();
		double s=r*r*Math.PI;
		double l=2*r*Math.PI;
		System.out.println(BigDecimal.valueOf(s).toPlainString()+" "+BigDecimal.valueOf(l).toPlainString());
	}
}