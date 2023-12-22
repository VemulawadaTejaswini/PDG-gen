import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //お札の枚数 2*10^3
		int y = stdIn.nextInt(); //金額 2*10^7
		
		
		//boolean flag = false; //実際にその金額になるか
		
		
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
				int k = n - i - j; //1000円札の枚数
				
				if(i*10000 + j*5000 + k*1000 == y) {
					System.out.println(i+" "+j+" "+k);
					return;
				}
				
				
			}
		}
		
		System.out.println(-1+" "+-1+" "+-1);
		
		
		
	}

}
