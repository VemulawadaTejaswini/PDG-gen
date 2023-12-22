import java.util.Scanner;

class Main{


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);			//文字の入力
		String S = sc.next();
		String ans = "abcdefghijklmnopqrstuvrxyz";
		for(int i = 0;i < S.length();i++){

			ans = 	ans.replace(String.valueOf(S.charAt(i)), "");

		}

		if(ans.length()==0){
			System.out.println("None");
		}else{
			System.out.println(ans.charAt(0));
		}
	}

}