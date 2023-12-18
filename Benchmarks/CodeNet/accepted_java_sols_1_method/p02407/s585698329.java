import java.util.Scanner;

class Main{
	public static void main(String[] args){
		int i = 0;// ループ回数設定値 １行目で入力した数値をここに格納する

		// 1行目読み込み・ループ回数設定
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		i = Integer.parseInt(str);

		// 2行目読み込み・配列に格納
		str = scan.nextLine();
		String[] array = str.split(" ");

		// 1行目で読み込んだ値と配列の要素数が一致したときのみ出力
		if(i == array.length){
			for(int j = i ; j > 0; j--){
				if(j == 1){
					System.out.print(array[j-1]);
				}
				else{
					System.out.print(array[j-1] + " ");
				}
			}
			System.out.println();
		}
	}
}
