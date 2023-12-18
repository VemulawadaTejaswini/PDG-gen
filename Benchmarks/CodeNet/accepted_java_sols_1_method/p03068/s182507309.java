import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int K = sc.nextInt();

		String[] array = S.split("");

		String X = array[K - 1];

		for (int i = 0; i < array.length; i++) {
			if(!( array[i].equals(X))){
				array[i] = "*";
			}

		}

		for (String string : array) {
			System.out.print(string);
		}

	}

}
