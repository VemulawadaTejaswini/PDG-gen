import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = null;
		String[] split = new String[2];
		int[] x = new int[3000];
		int[] y = new int[3000];
		int i = 0;


		while(true){
			// 読み込み
			str = scan.nextLine();
			split = str.split(" ");
			x[i] = Integer.parseInt(split[0]);
			y[i] = Integer.parseInt(split[1]);

			// break条件
			if(x[i] == 0 && y[i] == 0) break;

			// 入れ替え処理+格納処理
			if(x[i] > y[i]){
				swap(x, y, i);
			}
			i++;
		}
		for(int j=0; j<i; j++){
			System.out.println(x[j] + " " + y[j]);
		}
	}
	static void swap(int[] x, int[] y, int i){
		int tmp = 0;

		tmp = x[i];
		x[i] = y[i];
		y[i] = tmp;
	}
}
