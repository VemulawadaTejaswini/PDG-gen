import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Character> set = new HashSet<Character>();
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			set.add(sc.next().charAt(0));
		}
		sc.close();
		if(set.size() == 3) {
			System.out.println("Three");
		}else {
			System.out.println("Four");
		}
	}
}