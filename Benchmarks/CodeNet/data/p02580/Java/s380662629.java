import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int answer = 0;

		try {

			int H = sc.nextInt();
			int W = sc.nextInt();
			int M = sc.nextInt();

			HashMap<String, Integer> HMap = new HashMap<String, Integer>();
			HashMap<String, Integer> WMap = new HashMap<String, Integer>();

			for(int i = 0; i < M; i++) {
				String h = sc.next();
				if(HMap.containsKey(h)) {
					//今までにすでに格納されてる
					int hnum = HMap.get(h);
					hnum++;
					HMap.put(h, hnum);
				}else {
					//初めて格納される
					HMap.put(h, 1);
				}

				String w = sc.next();
				if(WMap.containsKey(w)) {
					//今までにすでに格納されてる
					int wnum = WMap.get(w);
					wnum++;
					WMap.put(w, wnum);
				}else {
					//初めて格納される
					WMap.put(w, 1);
				}
			}

			int HMAX = 0;
			int WMAX = 0;

			for(String key : HMap.keySet()) {
				if(HMAX < HMap.get(key)) {
					HMAX = HMap.get(key);
				}
			}

			for(String key : WMap.keySet()) {
				if(WMAX < WMap.get(key)) {
					WMAX = WMap.get(key);
				}
			}

			answer = HMAX + WMAX - 1;


		}finally {
			sc.close();
			System.out.println(answer);
		}
	}

}
