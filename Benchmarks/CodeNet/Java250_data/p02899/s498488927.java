import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> A = new TreeMap<Integer, Integer>();
		for(int i = 1; i <= N; i++) {
			A.put(sc.nextInt(), i);
		}
		for(Integer key : A.keySet()) {
			System.out.println(A.get(key) + " ");
		}
	}
}