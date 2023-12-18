import java.util.Scanner;


class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int  num = scanner.nextInt();//要素数
		int array[] = new int[num];
		int max = 0;
		//実行処理
		CountingSort(array, num, max,scanner);
		//後処理
		scanner.close();
	}

	public static void CountingSort(int[] array, int num, int max, Scanner scanner){ 
		int[] count = new int[10000];
		int[] sort = new int[num];
		int array_num = 0;
		//配列作成同時にカウント
		for(int i = 0; i < num; i ++ ){
			array[i] = scanner.nextInt();
			count[ array[i] ] ++;
			//比較して更新
			max = Math.max(max, array[i]);
		}
		//ソート処理
		for(int i = 0; i <= max; i ++ ){
			while( true ){
				count[i] --;
				if( count[i] < 0 )break;
				sort[array_num] = i;
				array_num ++;
				//出力
				System.out.print(sort[array_num - 1]);
				if( i == max && count[i] == 0) {
				System.out.print("\n");
				}else {
					System.out.print(" ");
				}
			}
		}
	}
}
