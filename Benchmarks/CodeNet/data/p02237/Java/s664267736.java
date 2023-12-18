import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();		//要素数
		
		for(int i = 0; i < num; i ++ ){		//要素数分処理
			insertionSort(num, scanner);
		}
		
		scanner.close();
	}
	
	public static void output(int[] array, int num){
	   //出力
	   StringBuilder sb = new StringBuilder("");
	   sb.append(array[0]);
	   for (int i = 1; i < num; i++) {
		  sb.append(" ").append(array[i]);
	   }
		System.out.println(sb);
	}
	
	public static void insertionSort(int num,  Scanner scanner){
		int off = scanner.nextInt();		//いらないけど仕方ない
		int ver_num = scanner.nextInt();	//頂点数
		int[] array = new int[num];			//格納用配列
		//頂点の分その場所を1にしていく
		for(int i = 0; i < ver_num; i ++ ){
			array[scanner.nextInt() - 1] = 1;
		}
		output(array, num);					//出力呼び
	}
}
