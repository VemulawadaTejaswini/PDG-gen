
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int  n = sc.nextInt();
		int  t = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		for(int i =0 ; i < n ;i++){
			int cc = sc.nextInt();
			int tt = sc.nextInt();
			if(tt <= t){
				min = Math.min(min,cc);
			}
		}
		
		if(min == Integer.MAX_VALUE){
			System.out.println("TLE");
		}else{
			System.out.println(min);
		}
	}
}
