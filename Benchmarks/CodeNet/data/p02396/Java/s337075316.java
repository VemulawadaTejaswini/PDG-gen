import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//ループ回数記録用変数
		int i = 1;
		
		//データの入力
		Scanner sc = new Scanner(System.in);
		while(true){
			
			short inputData = sc.nextShort();
			
			//終了条件の判定
			if(inputData == 0){
				break;
			}
			
			//結果を出力
			System.out.println("case " + i + ": " + inputData);
			
			i++;
		}
	}
}
