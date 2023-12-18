import java.util.Scanner;


class Main {
	private static	int array[];
	
	public static void main(String args[]) {
		//実行処理
		run();
	}

	public static void run(){ 
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		array = new int[num];
		int cut;
		//配列作成同時にカウント
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
		}
		//ソート処理
		cut = partition(0, num - 1 );
		//出力呼び
		output(num,cut);
		//後処理
		scanner.close();
	}
	//出力
	public static void output(int num, int cut){
		StringBuilder sb = new StringBuilder("");
		sb.append(array[0]);
		for (int i = 1; i < num; i++) {
				if (i == cut) sb.append(" [" + array[i] + "]");
				else sb.append(" " + array[i]); 
		}
		System.out.println(sb);
	}
	//ソート
	public static int partition(int par,int rim){
		int work = 0;
		int x = array[rim];
		int i = par - 1;
		//ソート処理
		for (int j = par ; j < rim ; j ++ ){
			if ( array[j] <= x ) {
				work = array[++i];
				array[i] = array[j];
				array[j] = work;
			}
		}
		//最後に入れ替え
		work = array[++i];
		array[i] = array[rim];
		array[rim] = work;
		return i;
	}
}
