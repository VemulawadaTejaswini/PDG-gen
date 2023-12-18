import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();
		char[] S_array = S.toCharArray();


		if (S_array[K-1]=='A') {
			S_array[K-1]='a';
		} else if (S_array[K-1]=='B') {
			S_array[K-1]='b';
		} else if (S_array[K-1]=='C') {
			S_array[K-1]='c';
		}

		System.out.println(S_array);
	}

}
