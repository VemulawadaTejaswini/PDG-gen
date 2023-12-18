import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み取りの準備
		Scanner sc = new Scanner(System.in);
		
		while(true){
			//データの読み取り
			int temp = sc.nextInt();
			
			//終了条件の判定
			if(temp == 0){
				break;
			}
			
			//各桁の和の計算
			int result = 0;
			while(temp != 0){
				result += temp % 10;
				temp /= 10;
			}
			
			System.out.println(result);
		}
	}
}
