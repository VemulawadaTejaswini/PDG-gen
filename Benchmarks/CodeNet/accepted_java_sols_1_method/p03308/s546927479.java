import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans;

		ArrayList<Integer> numArray = new ArrayList<>();

		for(int i = 0; i < N; i++){
		numArray.add(sc.nextInt());
		}
		Collections.sort(numArray);

		ans = numArray.get(N-1) - numArray.get(0);
		System.out.println(ans);

		sc.close();
	}

}
