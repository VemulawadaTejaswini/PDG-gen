import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();
		int N = sc.nextInt();

		int answer = 0;

		//HashMap<Key,Value>
		Map<Integer, Integer> ForbiddenMap = new HashMap<>();

		if(N != 0) {
			for(int i = 0; i < N; i++) {
				int getNum = sc.nextInt();
				ForbiddenMap.put(getNum,getNum);
			}

			int num = 0;
			while(true) {
				if(ForbiddenMap.containsKey(X - num)) {
					//含まれてたら次
				}else {
					//
					answer = X-num;
					break;
				}
				if(ForbiddenMap.containsKey(X + num)) {
					//含まれてたら次
				}else {
					answer = X+num;
					break;
				}
				num++;
			}

		}else if(N == 0) {
			answer = X;
		}

		System.out.println(answer);

	}

}
