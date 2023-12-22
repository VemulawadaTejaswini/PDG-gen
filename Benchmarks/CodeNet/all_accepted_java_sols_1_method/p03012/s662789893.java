import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N      = scanner.nextInt();
		int total  = 0;
		int totalA = 0;
		int totalB = 0;
		int temp   = 0;
		int answer = 101;
		int[]W     = new int[N];
		
		//合計を取得
		for(int i = 0; i < N; i ++){
			
			W[i] = scanner.nextInt();
			total = total + W[i];
		}
		
		//前のグループと後ろのグループの差を確認
		for(int i = 0; i < N; i ++){
			
			totalA = totalA + W[i];
			totalB = total - totalA;
			temp   = totalA - totalB;
			
			//差が最小になったとき
			if(temp < Math.abs(answer)){
				
				answer = temp;
			}
		}
		System.out.println(Math.abs(answer));
	}

}