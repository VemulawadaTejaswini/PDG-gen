import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		for(;;){
			
			int n = sc.nextInt();
			if(n == 0){
				break;
			}
			int sum = 0;
			int max = 0;
			int min = 1000;
			for(int i = 0; i < n ; i++){
				int s = sc.nextInt();
				min = Math.min(min, s);
				max = Math.max(max, s);
				sum += s;
			}
			
			System.out.println((sum-min-max)/(n-2));
			
			
		}
	}
}

