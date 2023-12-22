	import java.util.Scanner;
 
public class Main {
 
	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int answer,index;
		String s,t;
		
			// 整数の入力
		
		s = sc.next();
		sc.close();
		
		if(s.equals("Sunny")){
			System.out.print("Cloudy");
		}
		else if(s.equals("Cloudy")){
			System.out.print("Rainy");
		}
		else if(s.equals("Rainy")){
			System.out.print("Sunny");
		}

			// 出力
 
	}
}	