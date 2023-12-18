import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Map<String, String> hinaMap = new HashMap<>();

		for(int i = 0; i < N; i++) {
			String s = sc.next();
			hinaMap.put(s, s);
		}

		sc.close();

		String answer = "";

		if(hinaMap.size() == 3) {
			answer = "Three";
		}else if(hinaMap.size() == 4) {
			answer = "Four";
		}

		System.out.println(answer);
	}

}
