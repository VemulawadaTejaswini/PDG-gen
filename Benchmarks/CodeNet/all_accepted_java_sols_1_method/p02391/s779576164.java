import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		//テキスト入力クラス
		Scanner sc = new Scanner(System.in);
		
		//入力された値を取ってくる
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		//最初の入力値が、２番目の入力値以下だった場合
		if(first > second){
			System.out.println("a > b");	
		//２番目の入力値のほうが大きかった場合
		}else if(first < second){			
			System.out.println("a < b");
		//等しい場合
		}else{
			System.out.println("a == b");
		}	
	}
}