import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] stockPrice = new int[N];
			int money = 1000;
			int stock = 0;
			for(int i=0;i<N;i++) {
				stockPrice[i] = sc.nextInt();
			}
			
			for(int i=0;i<N-1;i++) {
				if(stockPrice[i] < stockPrice[i+1]) {
					stock += money/stockPrice[i];
					money %=stockPrice[i];
				}else {
					money+=stock*stockPrice[i];
					stock=0;
				}
			}
			money+=stock*stockPrice[N-1];
			System.out.println(money);
		}	
	}
}