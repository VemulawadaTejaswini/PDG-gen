import java.util.*;
import java.math.*;
import java.text.*;

public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt(),e=in.nextInt(),f=in.nextInt();
			double x=0,y=0;
			x=((double)c*(double)e-(double)b*(double)f)/((double)a*(double)e-(double)b*(double)d);
			y=((double)c*(double)d-(double)a*(double)f)/((double)b*(double)d-(double)a*(double)e);
			BigDecimal bx = new BigDecimal(x);
			BigDecimal by = new BigDecimal(y);
			System.out.println(bx.setScale(3,BigDecimal.ROUND_HALF_UP)+" "+by.setScale(3,BigDecimal.ROUND_HALF_UP));
		}
	}
}