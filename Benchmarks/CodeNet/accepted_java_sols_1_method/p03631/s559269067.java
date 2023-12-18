import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		String S1 =sc.next();

		for(int i = 0; i < S1.length();i++){
			if(S1.charAt(i) != S1.charAt(S1.length()-1-i)){
				System.out.println("No");

				return;
			}
		}

		System.out.println("Yes");


	}
}