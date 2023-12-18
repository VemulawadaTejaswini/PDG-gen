import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Map<String, Integer> map = new HashMap<>();

		for(int i = 0; i < q; i++) {
			int query = sc.nextInt();
			String key = sc.next();

			if(query == 0) {  //insert
				int x = sc.nextInt();
				map.put(key, x);
			}
			else if(query == 1){  //get
				System.out.println(map.getOrDefault(key, 0));
			}
			else map.remove(key);
		}
	}

}

