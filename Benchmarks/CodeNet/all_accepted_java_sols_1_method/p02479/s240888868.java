import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		double s = r*r*Math.PI;
		double l = 2*r*Math.PI;
		DecimalFormat fm = new DecimalFormat("#.000000");
		System.out.println(fm.format(s)+" "+fm.format(l));
	}
}