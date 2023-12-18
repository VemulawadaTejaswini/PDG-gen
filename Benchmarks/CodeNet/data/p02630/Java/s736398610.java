import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Integer,Integer> map = new HashMap<>();
		long sum = 0;
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			sum += a;
			map.put(a , map.getOrDefault(a, 0) + 1);
		}
		int q = sc.nextInt();

		for(int i = 0 ; i < q ; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			sum += (c - b) * map.getOrDefault(b, 0);
			System.out.println(sum);
			map.put(c , map.getOrDefault(c, 0) + map.getOrDefault(b, 0));
		}


		sc.close();


	}

}
