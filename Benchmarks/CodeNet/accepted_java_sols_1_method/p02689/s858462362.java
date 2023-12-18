
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		ArrayList<Integer> hyoukouDAO = new ArrayList<>();
		Map<Integer, Boolean> goodTen = new HashMap<>();

		for(int i = 0; i < N; i++) {
			hyoukouDAO.add(sc.nextInt());
			goodTen.put(i, true);
		}

		for(int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			int Ahyoukou = hyoukouDAO.get(A-1);
			int Bhyoukou = hyoukouDAO.get(B-1);

			//System.out.println(Ahyoukou + " " + Bhyoukou);

			if(Ahyoukou > Bhyoukou) {
				//Aの方がいい展望台
				goodTen.put(B-1, false);
			}else if(Ahyoukou < Bhyoukou) {
				goodTen.put(A-1, false);
			}else {
				goodTen.put(A-1, false);
				goodTen.put(B-1, false);
			}
		}

		int answer = 0;

		for(int i = 0; i < goodTen.size(); i++) {
			if(goodTen.get(i)) {
				answer ++ ;
			}
		}

		System.out.println(answer);

	}

}
