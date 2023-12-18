import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();

		Set<Integer> set = new HashSet<>();
		for(int i = 1;;i++) {
			int mod = (A * i)%B;
			int oldSize = set.size();
			set.add(mod);
			int newSize = set.size();
			if(oldSize == newSize) {
				break;
			}
		}
		String result = "NO";
		if(set.contains(C)) {
			result = "YES";
		}
		System.out.println(result);
	}
}