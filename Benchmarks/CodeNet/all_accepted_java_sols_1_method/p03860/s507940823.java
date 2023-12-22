import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in) ;
		String strings1 = sc.next();
		String strings2 = sc.next();
		String strings3 = sc.next();
		sc.close();
		
		//入力値を配列に入れて、配列[0]の要素をとりたい
		
		//要素の中身が小文字の場合、大文字に変える
		System.out.print(strings1.charAt(0));
		System.out.print(strings2.charAt(0));
		System.out.print(strings3.charAt(0));
		
		
	}
}
