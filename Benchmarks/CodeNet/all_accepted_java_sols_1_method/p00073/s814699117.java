import java.util.*;
import java.math.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			double x = in.nextDouble();
			double h = in.nextDouble();
			if(x==0 && h==0) break;
			double s = (x*x) + Math.sqrt((x*x/4)+(h*h))*x*2;
			DecimalFormat fm = new DecimalFormat("#.000000");
			System.out.println(fm.format(s));
		}
	}
}