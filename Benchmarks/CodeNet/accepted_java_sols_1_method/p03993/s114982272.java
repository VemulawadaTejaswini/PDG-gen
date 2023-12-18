import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		//
		int cnt = 0;
		Map<Integer, List<Integer>> map = new HashMap<>(); 
		for (int i=1; i<=N; i++) {
			int j = sc.nextInt();
			List<Integer> list = map.get(i);
			if (list!=null && list.contains(j)) {
				cnt++;
				continue;
			}
			list = map.get(j);
			if (list==null) {
				list = new ArrayList<Integer>();
				map.put(j, list);
			}
			list.add(i);
		}
		//
		System.out.println(cnt);
		sc.close();
	}
}
