import java.util.*;
import java.text.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double a = in.nextDouble();
		double b = in.nextDouble();
		int d = (int)a/(int)b;
		int r = (int)a%(int)b;
		double f = a/b;
		DecimalFormat fm = new DecimalFormat("#.######");
		System.out.println(d+" "+r+" "+fm.format(f));
	}
}