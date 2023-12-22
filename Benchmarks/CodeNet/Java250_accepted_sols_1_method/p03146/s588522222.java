import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer> ();
		a.add(s);
		int n = 0;
		boolean flag = true;
		
		while (flag) {
			if (a.get(n) % 2 == 0)
				a.add(a.get(n) / 2);
			else
				a.add(a.get(n) * 3 + 1);
			for (int i = 0; i <= n; i++) {
				if (a.get(n + 1) == a.get(i))
					flag = false;
			}
			n++;
				
		}
		
		System.out.println(n + 1);

	}

}