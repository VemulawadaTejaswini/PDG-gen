import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		
		int dup = N;
		while(!s.substring(N-dup).equals(t.substring(0, dup))) {
			dup--;
		}
		
		System.out.println(N*2-dup);
		sc.close();
	}
}
