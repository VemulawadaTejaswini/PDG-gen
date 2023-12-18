import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			s.add(sc.nextInt());
		}
		int q = sc.nextInt();
		int count = 0;
		for (int i = 0; i < q; i++)
			if (s.contains(sc.nextInt()))
				count++;
		System.out.println(count);
	}
}