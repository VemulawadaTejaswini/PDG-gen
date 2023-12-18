import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		Set<String> s_set = new HashSet<>();
		for(int i=0; i<N; i++) {
			String s = sc.next();
			s_set.add(s);
		}

		System.out.println(s_set.size());
	}
}
