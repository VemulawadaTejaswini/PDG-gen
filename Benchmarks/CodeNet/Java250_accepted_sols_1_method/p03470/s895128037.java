import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i < N; ++i) {
			int s = sc.nextInt();
			set.add(s);
		}
		System.out.println(set.size());
	}
}
