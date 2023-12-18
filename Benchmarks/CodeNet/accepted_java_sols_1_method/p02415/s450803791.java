import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] wordin = new String[1200];
		String word = sc.nextLine();
		for(int i = 1; i <= word.length(); i++) {
		//大文字の場合小文字に変換
			if(Character.isUpperCase(word.charAt(i-1))){
				wordin[i-1] = word.substring(i-1, i).toLowerCase();
				System.out.print(wordin[i-1]);
			}
		//小文字の場合大文字に変換
			else {
				wordin[i-1] = word.substring(i-1, i).toUpperCase();
				System.out.print(wordin[i-1]);
			}
		}
		sc.close();
		System.out.println("");
	}
}
