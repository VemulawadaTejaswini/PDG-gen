import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer,Integer> map = new TreeMap<>();
		for(int i = 0;i < N;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(map.containsKey(b)) {
				map.put(b, map.get(b)+a);
			}else {
				map.put(b, a);
			}
		}
		sc.close();
		int sum = 0;
		String ans = "Yes";
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			sum += entry.getValue();
			if(sum > entry.getKey()) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}