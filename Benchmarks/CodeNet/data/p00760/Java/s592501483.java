import java.util.Scanner;


public class Main {

	private void doit(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0){
			int y = sc.nextInt();
			int m = sc.nextInt();
			int d = sc.nextInt();
			int sum = calc(1000,1,1);
			int sum1 = calc(y,m,d);
			//System.out.println(sum + " " + sum1);
			System.out.println(sum - sum1);
		}
	}

	private int calc(int y, int m, int d) {
		int sum = 0;
		for(int i=1; i < y;i++){
			int nowday;
			if(i % 3 == 0){
				nowday = 20 * 10;
			}
			else{
				nowday = 20 * 5 + 19 * 5;
			}
			sum += nowday;
		}

		//month
		for(int i = 1; i <m; i++ ){
			int nowday;
			if(y % 3 == 0){
				nowday = 20;
			}
			else if(i % 2 == 0){
				nowday = 19;
			}
			else{
				nowday = 20;
			}
			sum += nowday;
		}

		sum += d;
		return sum;
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}

}