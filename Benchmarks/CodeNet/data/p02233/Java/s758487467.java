import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

class Main {
	static int Fibonacci (int n) {
		Map<Integer, Integer> values = new HashMap<> ();
		
		if (n == 0 || n == 1) return 1;
		Integer m = values.get (n);
		if (m != null) return m;
		m = Fibonacci (n - 2) + Fibonacci (n -1);
		values.put(n, m);
		
		return m;
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = Fibonacci (scan.nextInt());
		scan.close();
		System.out.println(n);
	}
}

