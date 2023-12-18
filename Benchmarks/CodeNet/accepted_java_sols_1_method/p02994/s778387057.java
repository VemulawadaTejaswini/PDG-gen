import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), L = sc.nextInt();
		Map<Integer, Integer> map = new TreeMap<>();
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			sum += L+i-1;
			map.put(Math.abs(L+i-1),i);
		}
		int le = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			le = entry.getValue();
			break;
		}
		sum -= L+le-1;
		System.out.println(sum);
	}
}