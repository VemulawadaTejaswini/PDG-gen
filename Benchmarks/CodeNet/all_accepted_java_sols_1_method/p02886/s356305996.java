import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}

		sc.close();

		int result = 0;

		for(int i=0;i<N;i++) {
			int x = list.get(i);
			for(int j=i+1;j<N;j++) {
				result = x*list.get(j)+result;
			}
		}

		System.out.println(result);
	}
}
