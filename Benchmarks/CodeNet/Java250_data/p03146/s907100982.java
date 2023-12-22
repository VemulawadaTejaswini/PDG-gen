import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		Set<Integer> set = new HashSet<>();
		set.add(s);
		
		int i = 1;
		while (true) {
			i++;
			s = f(s);
			if (!set.add(s)) break;
		}
		
		System.out.println(i);
		
		sc.close();
	}
	
	static int f(int n) {
		if (n % 2 == 0) return n / 2;
		return 3 * n + 1;
	}
}


