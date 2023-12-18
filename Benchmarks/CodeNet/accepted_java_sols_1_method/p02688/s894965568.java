import java.util.HashSet;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var set = new HashSet<Integer>();
		var sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		for(var i = 0; i < k; i++) {
			var d = sc.nextInt();
			for(var j = 0; j < d; j++) {
				var a = sc.nextInt();
				set.add(a);
			}
		}
		sc.close();

		System.out.println(n - set.size());
	}
}