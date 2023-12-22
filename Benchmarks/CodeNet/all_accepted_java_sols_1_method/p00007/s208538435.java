import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		double debt = 100000;
		for (int i = 0; i < n; i++) {
			debt += debt / 20;
			double r = debt % 1000;
			int v = (int)debt / 1000;
			debt = 1000 * v ;
			debt = r>0?debt+1000:debt;
		}
		System.out.println((int)debt);
	}
}

