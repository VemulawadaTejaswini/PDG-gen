import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		
		//入力文字を取得
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		//3つの数が、条件を満たし、yesの場合
		if(first < second && second < third){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}		
	}
}