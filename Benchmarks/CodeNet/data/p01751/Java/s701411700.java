
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		int total=0;
		int n = 0;
		
		for(int i=0;i<60;i++) {
			total += a;
			if(n+c <= total) {
				System.out.println(n + c);
				return;
			}
			total += b;
			if(n+c < total) {
				n += 60;
			}
			else {
				continue;
			}
			
			
		}
		
		System.out.println("-1");
	}

}

