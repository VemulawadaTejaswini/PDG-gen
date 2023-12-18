
import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	void run(){
		for(;;){
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			int min = 1000;
			int max = 0;
			for(int i =0 ; i< n ; i++){
				int x = sc.nextInt();
				max = Math.max(x,max);
				min = Math.min(x, min);
				sum += x;
			}
			System.out.println((sum-min-max)/(n-2));
		}
		
	}
	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}