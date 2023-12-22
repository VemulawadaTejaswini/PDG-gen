import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Set<String> s = new HashSet<String>();
		for(int i = 0 ; i  < N ; ++i){
			String S = sc.next();
			s.add(S);
		}
		System.out.println(s.size());
	}
}
