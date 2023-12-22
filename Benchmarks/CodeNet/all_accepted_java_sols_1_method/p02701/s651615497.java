import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var hs = new HashSet<String>();
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		for(var i = 0; i < n; i++) {
			hs.add(sc.next());
		}
		sc.close();

		System.out.println(hs.size());
	}
}