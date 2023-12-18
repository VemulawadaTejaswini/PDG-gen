import java.util.Scanner;

class Main{




	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);			//文字の入力
		String string = sc.next();
		System.out.println((string.charAt(0)+String.valueOf(string.length()-2)+string.charAt(string.length()-1)));

	}
}


