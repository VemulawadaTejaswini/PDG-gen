import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		String S =scanner.next();
		String T =scanner.next();
		
		//個数表示
		int A = scanner.nextInt();
		int B = scanner.nextInt() ; 
		
		//減らしたい文字の入力表示
		String U =scanner.next();
		
		//Uの選んだ数字が１つ減る
		 if(S.equals(U)) {
			 A--; 
		 }
		 else {
			 B--; 
		 }
		 System.out.println(A+" " +B);
		 
		scanner.close();
	}
}