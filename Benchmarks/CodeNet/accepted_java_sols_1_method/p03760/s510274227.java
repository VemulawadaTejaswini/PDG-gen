
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String o, e;
		o = sc.next();
		e = sc.next();
		sc.close();
		
		StringBuilder ans = new StringBuilder();
		
		int n = Math.max(o.length(),  e.length());
		
		for(int i = 0; i < n; ++i) {
			ans.append(o.charAt(i));
			if(i < e.length())
			ans.append(e.charAt(i));
		}
		
		System.out.println(ans);
	}

}
