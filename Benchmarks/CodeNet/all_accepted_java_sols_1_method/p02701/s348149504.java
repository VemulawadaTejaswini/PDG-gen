import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		var ss = new HashSet<String>();
		
		for (int i=0; i<n; i++) {
			String s = sc.nextLine();
			ss.add(s);
		}
		
		System.out.println(ss.size());
		
		sc.close();
	}
}
