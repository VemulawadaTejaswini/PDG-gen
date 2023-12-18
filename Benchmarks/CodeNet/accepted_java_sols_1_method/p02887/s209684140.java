import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Character> slime = new ArrayList<>();
		int N = sc.nextInt();
		String S = sc.next();
		slime.add(S.charAt(0));
		int j = 1;

		for(int i = 1; i < N; i++) {
			char c = S.charAt(i);
			if(slime.get(j - 1) != c) {
				slime.add(c);
				j++;
			}
		}

		System.out.println(slime.size());
		sc.close();
	}
}
