import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


class Main {
	static Map<Integer, Integer> values = new HashMap<> ();
	
	static int Fibonacci (int n) {
		
		if (n == 0 || n == 1) return 1;
		
		Integer m = values.get(n);
		if (m != null ) return m;
		
		m = Fibonacci(n - 1) + Fibonacci(n - 2);
		values.put(n, m);
		return m;
		
	}
	
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		n = Fibonacci (n);
		scan.close();	
		System.out.println(n);
	}
}

