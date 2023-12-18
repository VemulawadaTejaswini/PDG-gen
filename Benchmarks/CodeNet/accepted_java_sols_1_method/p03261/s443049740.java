import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		List<String> s = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String word = sc.next();
			if(s.contains(word)) {
				System.out.println("No");
				return;
			}
			s.add(word);
		}

		char c = s.get(0).charAt(0);
		for (String w : s) {
			if(w.charAt(0) == c) {
				c = w.charAt(w.length()-1);
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}

}
