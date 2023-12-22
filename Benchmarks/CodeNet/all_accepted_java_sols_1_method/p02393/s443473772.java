import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		//要素数３の配列を宣言
		int[] array = new int[3];

		Scanner sc = new Scanner(System.in);
		//配列に入力した数値を格納
		array[0] = sc.nextInt();
		array[1] = sc.nextInt();
		array[2] = sc.nextInt();

		for(int i = 0 ;i < array.length-1 ;i++){
			//比較する対象分繰り返す
			for(int j = 0;j < array.length-1 ;j++){
				//配列のjとj+1の要素を比較し,j+1>jならば数値を入れ替える
				if(array[j] > array[j+1]){
					int intChange = array[j];
					array[j] = array[j+1];
					array[j+1] = intChange;
				}
			}
		}
		//並び替えたものを出力
		System.out.println(array[0] + " " + array[1] + " " + array[2]);
	}
}

