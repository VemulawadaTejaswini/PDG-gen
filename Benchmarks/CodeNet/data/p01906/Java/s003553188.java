
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {

		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[] = new int[n];
		for(int i =0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}
		
		int result = 0;
		int x = 0;
		for(;;){
			int min = a[x];
			int max = a[x];
			for(int i =0 ; i< m ; i++){
				min = Math.min(min, a[x]);
				max = Math.max(max, a[x]);
				x++;
				if(x == n) x = 0;
			}
			result += max - min;
			if(x == 0){
				break;
			}
		}
		System.out.println(result);
		
	}
}

