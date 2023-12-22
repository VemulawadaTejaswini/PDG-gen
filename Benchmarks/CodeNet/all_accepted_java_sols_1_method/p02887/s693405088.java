import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		//charに変換して1文字ずつ比べる
		char[] C = S.toCharArray();
		
		int count = 1;
		//すべての文字列が等しいときは1なのでcountを1にする
		//例：aabba→abaは3となるため
		//forでi番目とi+1番目が等しくないときはcountに+1をする
		for(int i=0; i<N-1; i++) {
			if(C[i]!=C[i+1]) {
				count++;
			}
		}
		System.out.println(count);
	}
}