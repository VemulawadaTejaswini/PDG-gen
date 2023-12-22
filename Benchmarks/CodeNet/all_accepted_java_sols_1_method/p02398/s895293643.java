import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner src = new Scanner(System.in);
		
		//約数のカウント
		int count = 0;		
		
		//標準入力
		int a = src.nextInt();
		int b = src.nextInt();
		int c = src.nextInt();
       
		//aがbより小さい場合a～bの計算を繰り返す
		if(a <= b){
			int n = b - a;
			
			//a～b間でcの約数をカウントする
			for(int i = 0; i <= n; i++) {
				int answer = c % a;
				a += 1;
					
				if(answer == 0) {
					count += 1;
				}
			}
			
			System.out.println(count);
		
		}else {
			
			System.out.println(count);
			
		}
	}
}
