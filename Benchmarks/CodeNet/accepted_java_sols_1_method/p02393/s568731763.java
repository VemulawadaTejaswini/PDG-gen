import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		//データの読み込み準備
		Scanner sc = new Scanner(System.in);
		
		//データ格納用配列
		int numbers[] = new int[3];
				
		//データの格納
		numbers[0] = sc.nextInt();
		numbers[1] = sc.nextInt();
		numbers[2] = sc.nextInt();
		
		//バブルソート
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2 - i;j++){
				if(numbers[j] > numbers[j+1]){
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
		
		//結果の出力
		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2]);
	}
}
