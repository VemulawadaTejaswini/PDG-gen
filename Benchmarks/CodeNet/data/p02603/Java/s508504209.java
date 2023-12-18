import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int N = sc.nextInt();
			int[] a = new int[N];
			
			int money = 1000;
			int stock = 0;
			for(int i=0;i<N;i++) {
				a[i] = sc.nextInt();
			}
			
			for(int i=0;i<N-1;i++) {
				if(a[i] < a[i+1]) {
					stock += money/a[i];
					money %=a[i];
				}else {
					money+=stock*a[i];
					stock=0;
				}
			}
			money+=stock*a[N-1];
			System.out.println(money);
		}	
	}
}