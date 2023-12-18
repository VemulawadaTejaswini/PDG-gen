import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		var sc = new java.util.Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		var p = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			p.add(sc.nextInt());
		}
		Collections.sort(p);

		int count = 0;
		for(int i=0;i<k;i++) {
			count+=p.get(i);
		}

		System.out.println(count);
	}
}