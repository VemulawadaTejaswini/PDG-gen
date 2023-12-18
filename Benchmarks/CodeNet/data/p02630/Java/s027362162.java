import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		ArrayList<Integer> list = new ArrayList<>();
		int[] number = new int[100000];
		Arrays.fill(number, 0);
		long sum = 0;
		for(int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(sc.next());
			list.add(tmp);
			number[tmp]++;
			sum += tmp;
		}
		int Q = Integer.parseInt(sc.next());
		Map<Integer, Integer> map = new LinkedHashMap<>();
		for(int i = 0; i < Q; i++) {
			int tmpA = Integer.parseInt(sc.next());
			int tmpB = Integer.parseInt(sc.next());
			map.put(tmpA, tmpB);
		}
		sc.close();

		for(Integer key : map.keySet()) {
			int changeCount = number[key];
			sum = sum + (map.get(key) - key) * changeCount;
			number[key] = 0;
			number[map.get(key)] += changeCount;
			System.out.println(sum);
		}
	}

}