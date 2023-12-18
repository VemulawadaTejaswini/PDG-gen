 import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		int N= scanner.nextInt();
		String S = scanner.next();
		
		String T ="";
		String F ="";
		
		T =S.substring(0, S.length()/2);
		F =S.substring(S.length()/2,N);
		
		if( T.equals(F)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}