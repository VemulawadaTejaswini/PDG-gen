import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while (true){
			int n = sc.nextInt();
			int sum = 0;
			
			//終了条件の判定
			if (n == 0){
				break;
			}
			
			int[] data = new int[n];
			
			//データの入力
			for (int i = 0; i < n; i++){
				data[i] = sc.nextInt();
			}
			
			//データのソート
			Arrays.sort(data);
			
			for (int i = 1; i < n - 1; i++){
				sum += data[i];
			}
			
			System.out.println(sum / (n - 2));
		}
				
	}
}
