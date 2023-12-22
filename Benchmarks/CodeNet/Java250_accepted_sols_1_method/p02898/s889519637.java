import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc142/tasks/abc142_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		List<Integer> listH = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			listH.add(sc.nextInt());
		}

		sc.close();

		int result = 0;
		for(int height:listH) {
			if(height>=K) {
				result++;
			}
		}

		System.out.println(result);

	}

}
