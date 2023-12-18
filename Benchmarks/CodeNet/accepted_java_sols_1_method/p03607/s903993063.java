import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			if(set.contains(A)) {
				set.remove(A);
			}else {
				set.add(A);
			}
		}
		sc.close();
		System.out.println(set.size());
	}
}