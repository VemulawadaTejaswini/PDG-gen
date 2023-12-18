import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < k && i < b - a + 1; i++) {
			set.add(a + i);
			set.add(b - i);
		}
		
		for (int n : set)
			System.out.println(n);
		
		sc.close();
	}
}


