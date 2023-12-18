import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//入力するためのオブジェクトを生成
		Scanner sc = new Scanner(System.in);
	
		//ScannerクラスのnextInt()クラスを使う
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		//小さい値２つの領域の確保
		int ans1 = 0;
		int ans2 = 0;

		//値を二つずつ比較する
		if(Math.min(a,b)==a){
			ans1 = a;
			if(Math.min(b,c)==b){
				ans2 = b;
			}else{
				ans2 = c;
			}				
		}else{
			ans1 = b;
			if(Math.min(a,c)==a){
				ans2 = a;
			}else{
				ans2 = c;
			}	
		}

		//出力する
		System.out.print(ans1 + ans2);

		//scオブジェクトを閉じる
		sc.close();
	}
}
		
		
