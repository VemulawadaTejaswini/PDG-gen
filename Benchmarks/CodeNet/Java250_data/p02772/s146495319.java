
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		boolean ok = true;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			if(a%2==0) {
				if(a%3 != 0 && a%5 != 0) {
					ok=false;
					break;
				}
			}
		}
		if(ok) {
			System.out.println("APPROVED");
		}else {
			System.out.println("DENIED");
		}
		sc.close();
	}
}
