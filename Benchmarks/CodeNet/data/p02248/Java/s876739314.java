import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		String P = sc.next();
		
		for(int i = 0; i < T.length() - P.length() + 1; i++) {
			if(T.substring(i, i + P.length()).equals(P)) {
				System.out.println(i);
			}
		}
	}
}