import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		int m = Integer.parseInt(scan.next());

		List<Integer> ac = Arrays.asList(new Integer[n]);
		List<Integer> pena = Arrays.asList(new Integer[n]);
		Collections.fill(ac, 0);
		Collections.fill(pena, 0);


		for(int i=0; i<m; ++i)  {
			int p = Integer.parseInt(scan.next());
			String s = scan.next();
			--p;
			if(ac.get(p) == 1) continue;
			if(s.equals("AC")) {
				ac.set(p, 1);
			} else {
				pena.set(p, (pena.get(p)+1));
			}
		}
		scan.close();

		int AC = 0, PENA = 0;
		for(int i=0; i<n; ++i) {
			AC += ac.get(i);
			if(ac.get(i) == 1) PENA += pena.get(i);
		}

		System.out.println(AC + " " + PENA);

	}

}