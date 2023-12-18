import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean judje = true;

		Scanner scan = new Scanner(System.in);

		char[] S = scan.next().toCharArray();
		char[] T = scan.next().toCharArray();

		for(int i = 0; i < S.length; i++)
			if(S[i] != T[i])
				judje = false;

		if(T.length - S.length != 1)
			judje = false;

		System.out.println((judje ? "Yes" : "No"));
	}

}
