import java.util.Scanner;


public class Main {
	Scanner sc = new Scanner(System.in);
	
	void run(){
		char c[] = sc.next().toCharArray();
		int l = c.length;
		while(l-- != 0){
			System.out.print(c[l]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}