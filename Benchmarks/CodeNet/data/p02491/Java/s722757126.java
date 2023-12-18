import java.text.*;
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int d = a/b;
		int r = a%b;
		double f = (double)a/(double)b;
		DecimalFormat fm = new DecimalFormat("#.000000");
		System.out.println(d+" "+r+" "+fm.format(f));
	}
}