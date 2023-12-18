import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String ABCD = sc.next();
		sc.close();

		ArrayList<Integer> abcdList = new ArrayList<>();

		for(int i = 0; i < 4; i++) {
			abcdList.add(Integer.parseInt(ABCD.substring(i,i+1)));
		}

		Map<Integer, String> Mappp = new HashMap<>();
		Mappp.put(0, "+");
		Mappp.put(1, "-");

		String answer = "";

		for(int a = 0; a < 2; a++) {
			//aが2番目
			for(int b = 0; b < 2; b++) {
				//bが2番目
				for(int c = 0; c < 2; c++) {
					int ans = abcdList.get(0);
					if(a==0) {
						ans += abcdList.get(1);
					}else {
						ans -= abcdList.get(1);
					}

					if(b==0) {
						ans += abcdList.get(2);
					}else {
						ans -= abcdList.get(2);
					}

					if(c==0) {
						ans += abcdList.get(3);
					}else {
						ans -= abcdList.get(3);
					}

					if(ans == 7 && answer.equals("")) {
						answer += abcdList.get(0).toString() + Mappp.get(a);
						answer += abcdList.get(1).toString() + Mappp.get(b);
						answer += abcdList.get(2).toString() + Mappp.get(c);
						answer += abcdList.get(3).toString() + "=7" ;
						break;
					}
				}
			}
		}

		System.out.println(answer);
	}
}
