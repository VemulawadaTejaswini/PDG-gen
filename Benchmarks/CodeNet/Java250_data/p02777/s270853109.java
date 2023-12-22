import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int a = sc.nextInt();
		int b = sc.nextInt();

		Map<String,Integer> map = new HashMap<>();
		map.put(s, a);
		map.put(t, b);

		String u = sc.next();
		map.put(u,map.get(u)-1);

		System.out.println(map.get(s)+ " " + map.get(t));
	}
}