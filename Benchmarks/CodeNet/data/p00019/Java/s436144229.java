import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		int n = sc.nextInt();
		long ans = 1;
		while(n>0) ans *= n--;
		System.out.println(ans);
	}
	
	
	public static void main(String[] args) {
		new Main().run();
	}
}