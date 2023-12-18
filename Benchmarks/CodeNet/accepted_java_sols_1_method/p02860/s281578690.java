
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		char []c = sc.next().toCharArray();
		
		if(n % 2 ==1) {
			System.out.println("No");
			return;
			
		}
		
		int temp = -1;
		
		for(int i = 0 ; i < n/2 ; i++) {
			if(c[i] != c[i+n/2]) {
				temp = 0;
				break;
			}
		}
		
		if(temp == -1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
