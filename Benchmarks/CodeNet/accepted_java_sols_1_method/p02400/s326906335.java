import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		double s = r*r*Math.PI;
		double l = r*2*Math.PI;
		DecimalFormat fm = new DecimalFormat("#.######");
		System.out.println(fm.format(s)+" "+fm.format(l));
	}
}