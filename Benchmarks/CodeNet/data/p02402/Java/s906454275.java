import java.util.Scanner;
public class Main{
	public static void main(String[] args){

		//次に入力する数値の個数を決めるスキャナー
		Scanner scan = new Scanner(System.in);

		//int型の宣言と一つ目の入力
		int intNum = scan.nextInt();
		//配列の宣言と要素数に入力した内容を代入
		int[] array = new int[intNum];

		//scan2で順番に要素を格納していく
		for(int i = 0 ;i < intNum;i++){
			array[i] = scan.nextInt();
		}

		long longSum = 0;
		for(int i = 0 ;i < intNum;i++){
			longSum+=array[i];
		}

		for(int i = 0 ;i < intNum;i++){
			for(int j = 0 ;j < intNum-1;j++ ){
				if(array[j] > array[j+1]){
					int intCh = array[j];
					array[j] = array[j+1];
					array[j+1] = intCh;
				}
			}
		}
		System.out.println(array[0] + " " + array[array.length-1] + " " + longSum);
		scan.close();
	}
}

