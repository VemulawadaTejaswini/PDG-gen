import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = "";
		//HashSetで重複を許可しない空箱setを作成
		Set<String> set = new HashSet<String>();
		for(int i=0; i<N; i++) {
			S = sc.next();
		//setに重複を除いた景品名を入れる
			set.add(S);
		}
		//setに含まれる要素数を出力する
		System.out.println(set.size());
	}		
}