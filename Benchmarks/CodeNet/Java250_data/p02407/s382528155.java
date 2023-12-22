import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n; i++){
			a[i] = s.nextInt();
		}
		for(int i = n - 1; 0 <= i; i--){
			System.out.print(a[i]);
			if(i != 0) System.out.print(" ");
		}
		System.out.println();
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