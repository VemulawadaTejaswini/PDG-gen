import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			map.put(a, i);
		}
		
		map.entrySet().stream().map(e -> e.getValue() + " ").forEach(System.out::print);
		System.out.println();
	}
}
