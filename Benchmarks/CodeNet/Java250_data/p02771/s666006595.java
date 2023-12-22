import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		Set<Integer> set = new TreeSet<>();
		set.add(A);
		set.add(B);
		set.add(C);

		if(set.size()==2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}