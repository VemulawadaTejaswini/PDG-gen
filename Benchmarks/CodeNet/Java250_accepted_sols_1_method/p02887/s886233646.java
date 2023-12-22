import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://atcoder.jp/contests/abc143/tasks/abc143_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		String[] strArray = new String[N+1];
		for (int i = 0; i < N; i++) {
		    // strの先頭から1文字ずつString型にして取り出す
			strArray[i] = String.valueOf(S.charAt(i));
		}

		List<String> list = new ArrayList<String>();
		for(int i=0;i<N;i++) {
			String str = strArray[i];
			if(!(str.equals(strArray[i+1])&&(i+1)!=N)) {
				list.add(str);
			}
		}
		System.out.println(list.size());

	}
}
