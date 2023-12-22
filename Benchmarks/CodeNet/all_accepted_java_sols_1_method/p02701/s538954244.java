import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String[] S = new String[N];
		Set<String> list = new LinkedHashSet<String>();
		for(int i = 0; i < N; i++) {
			 S[i] = sc.next();
		}
		sc.close();
		
		for(int i = 0; i < N; i++) {
			 list.add(S[i]);
		}
		
		System.out.println(list.size());
		
	}

}