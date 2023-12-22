import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int n = stdIn.nextInt();

		Set<String> set = new HashSet<>();

		for(int i = 0; i < n; i++) {
			String s = stdIn.next();
			set.add(s);

		}

		int cnt = 0;
		for(String x: set) {
			cnt++;
		}
		
		System.out.println(cnt);


	}

}
