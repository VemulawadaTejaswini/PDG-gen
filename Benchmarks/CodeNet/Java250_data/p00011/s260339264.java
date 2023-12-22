import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int w;
		int n;
		
		//データ入力の準備
		Scanner sc = new Scanner(System.in);
		
		//あみだくじのサイズを入力
		w = sc.nextInt();
		n = sc.nextInt();
		
		//データ格納用配列の追加
		int[] data = new int[w];
		for (int i = 0; i < w; i++){
			data[i] = i + 1;
		}
		
		//あみだくじのswap
		for (int i = 0; i < n; i++){
			String str = sc.next();
			String ab[] = str.split(",");
			
			int a = Integer.parseInt(ab[0]) - 1;
			int b = Integer.parseInt(ab[1]) - 1;
			
			swap(data,a,b);
		}
		
		//結果の出力
		for (int i = 0; i < w; i++){
			System.out.println(data[i]);
		}
	}
	
	private static void swap(int[] data, int a, int b){
		int temp = data[a];
		data[a] = data[b];
		data[b] = temp;
	}
}
