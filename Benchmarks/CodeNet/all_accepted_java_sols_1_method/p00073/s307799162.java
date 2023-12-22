import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			double x = sc.nextDouble();
			double h = sc.nextDouble();
			if (x==0) {break;}
			double area = x*x;
			area += 4*Math.sqrt(Math.pow(x/2,2)+Math.pow(h,2))*x/2;
			out.println(area);
		}
	}
}
