import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			map.put(sc.nextInt(), i);
		}
		int i = 0;
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			System.out.print(e.getValue() + 1);
			i++;
			if (i<N) {
				System.out.print(" ");
			}
		}
	}
}
