import java.util.*;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();//整数の数
		int cnt = a;
		
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < a; i++) {
			list.add(sc.nextInt());
		}
		Collections.sort(list);
		Collections.reverse(list);
		
		for (int i = 0; i < a; i++) {
			int b = list.get(i);
			for (int j = a; j < a; j++) {
				if (j == i) {
					continue;
				}
				int c = list.get(j);
				if (b % c == 0) {
					cnt--;
					break;
				}
			}
		}
		System.out.println(cnt);
	}
}