import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0045
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int sum1 = 0, sum2 = 0, cnt = 0;;
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			int a = new Integer(ss[0]), b = new Integer(ss[1]); 
			sum1 += a * b;
			sum2 += b;
			cnt++;
		}
		System.out.println(sum1);
		System.out.printf("%1.0f", (double)sum2 / cnt);
	}
}