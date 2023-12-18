import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;

// AOJ 0034
public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			int v1 = new Integer(ss[10]), v2 = new Integer(ss[11]), L = 0;
			int[] ls = new int[10];
			for (int i = 0; i < 10; i++) {
				ls[i] = new Integer(ss[i]);
				L += ls[i];
			}
			double d = (double)v1 * L / ((double)(v1 + v2)); 
			int j = 0;
			do {
				d -= (double)ls[j++];
			} while (d > 0);
			System.out.println(j);
		}
	}
}