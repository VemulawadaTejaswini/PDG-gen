import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		while(true){
		int f = s.nextInt();
		int m = s.nextInt();
		int r = s.nextInt();
		if(m == -1 && f == -1 && r == -1) break;
		if(m == -1 || f == -1){
			System.out.println("F");
			continue;
		}
		int sum = m + f; 
		if(sum >= 80) System.out.println("A");
		else if(sum >= 65 && sum < 80) System.out.println("B");
		else if(sum >= 50 && sum < 65) System.out.println("C");
		else if(sum >= 30 && sum < 50) {
			if(r >= 50) System.out.println("C");
			else System.out.println("D");
			}
		else if(sum < 30) System.out.println("F");
		}
	}

	public static void main(String[] args) {
	
		new Main().run();
		
	}
}