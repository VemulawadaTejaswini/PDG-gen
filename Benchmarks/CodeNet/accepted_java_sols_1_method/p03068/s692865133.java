import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int k = sc.nextInt();
		sc.close();
		sc = null;
		StringBuilder s2 = new StringBuilder();
		for(i=0; i<n; i++) {
			if(s.charAt(i) != s.charAt(k-1)) s2.append('*');
			else s2.append(s.charAt(i));
		}
		System.out.println(s2);
	}
}