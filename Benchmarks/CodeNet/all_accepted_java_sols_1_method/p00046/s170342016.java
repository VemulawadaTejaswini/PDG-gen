import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		double min = Integer.MAX_VALUE;
		double max = Integer.MIN_VALUE;
		double n;
		while (sc.hasNext()) {
			n = sc.nextDouble();
			min = Math.min(min,n);
			max = Math.max(max,n);
		}
		out.println(Math.abs(max-min));
	}
}
