import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public Main(int opt1, int opt2) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		map.put(3, 3);
		map.remove(opt1);
		map.remove(opt2);
		String res = map.values().toString();
		System.out.println(res.substring(1,2));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opt1 = sc.nextInt();
		int opt2 = sc.nextInt();
		Main m = new Main(opt1, opt2);

	}
	
}
