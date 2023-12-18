import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	public void run() {
			int n = sc.nextInt();
			calc(n);
	}
	public void calc(int n){
		if(n == 1){
			System.out.println(0);
			return;
		}
		int count = 1;
		int a = n / 3;
		int b = (n - a) / 2;
		int c = n - a - b;
		
		while(c != 1){
			a = c / 3;
			b = (c - a) / 2;
			c = c - a - b;
			
			count++;
		}
		System.out.println(count);
	}

	
	public static void main(String[] args) {
		new Main().run();
	}
}