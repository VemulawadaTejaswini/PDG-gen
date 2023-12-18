import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		String S = scanner.next();

		int seikai = 0;


		for (int i = 0; i <=3; i++) {

		if(S.substring(i,i+1).equals("+")) {    //文字列の中身だけ比較する

			seikai++;
		}

			else {

			seikai--;
		}


}

		System.out.println(seikai);
}

}