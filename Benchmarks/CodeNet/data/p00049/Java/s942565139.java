import java.util.*;
import static java.util.Arrays.*;
import static java.lang.Math.*;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static final double EPS = 1e-8;
	public static void main(String[] args) {
		
		int[] hist = {0, 0, 0, 0};
		while (sc.hasNext()) {
			String[] ss = sc.next().split(",");
			if (ss[1].equals("A")) {
				hist[0]++;
			} else if (ss[1].equals("B")) {
				hist[1]++;
			} else if (ss[1].equals("AB")) {
				hist[2]++;
			} else if (ss[1].equals("O")) {
				hist[3]++;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println(hist[i]);
		}
	}
}