import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int count = 0;
		for(int i = a; i <= b; i++){
	        if(c % i == 0) count++; 
		}
		System.out.println(count);
	}
	
	public static void main(String[] args) {
		/* 
		 * Main x;
		 * x = new Main();
		 * x.run();
		 * ??¨????????????
		 */
		new Main().run();
		
	}
}