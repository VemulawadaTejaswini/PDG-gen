import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0075
public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			double a = Double.valueOf(ss[1]), b = Double.valueOf(ss[2]);
			double bmi = a / (b * b);
			if (bmi - 25.0 - EPS > 0) 
				System.out.println(ss[0]);
		}
	}	
}