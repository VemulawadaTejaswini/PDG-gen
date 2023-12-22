
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int y = sc.nextInt();
		
		
		for(int i = 0; i <= n; i++) {
			for(int k = 0; k <= n-i; k++) {
				
				int j = n - (i + k);
				
				if(y == (i * 10000) + (k * 5000) + (j * 1000)) {
					System.out.println(i + " " + k  + " "  + j);
					System.exit(0);
				}	
			}
		}

		System.out.println("-1 -1 -1");
	}

}
