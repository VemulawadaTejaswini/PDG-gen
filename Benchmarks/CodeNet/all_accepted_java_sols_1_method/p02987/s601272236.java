import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.nextLine();
		char s1 = S.charAt(0);
		S = S.replaceAll(s1+"","");
		if(S.length()!=2) {
			System.out.println("No");
			return;
		}
		if(S.charAt(0)==S.charAt(1)) {
			System.out.println("Yes");

		}else {

			System.out.println("No");
		}


	}
}