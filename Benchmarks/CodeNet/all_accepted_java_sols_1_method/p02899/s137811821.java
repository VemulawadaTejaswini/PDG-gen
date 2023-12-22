import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer, Integer> tree = new TreeMap<Integer, Integer>();
		for(int i = 0; i < n; ++i)
		tree.put(sc.nextInt(), i + 1);
		sc.close();
		for(int i = 1; i <= n; ++i){
			System.out.print(tree.get(i) + " ");
		}
		System.out.println();
	}
}
