import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var a = sc.nextInt();
		var b = sc.nextInt();
		var c = sc.nextInt();
		var d = sc.nextInt();
		sc.close();

		var max = Long.MIN_VALUE;
		var list = new ArrayList<Long>();
		list.add((long)a * c);
		list.add((long)a * d);
		list.add((long)b * c);
		list.add((long)b * d);
		for(var x : list) {
			max = Math.max(max, x);
		}

		System.out.println(max);
	}
}
