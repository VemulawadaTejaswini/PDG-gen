
import java.util.Scanner;
import java.util.Objects;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int n = sc.nextInt();
				if(n ==0)	break;
				int s = 0;
				check:
				for(int i=1; i<=n ;i++) {
					if(n%i == 0 && i != n) {
						s+=i;
						if(s > n) {
							break check;
						}
					}
					
					//System.out.println(s);
				}
				if(n == s) {
					System.out.println("perfect number");
				}else if(n > s) {
					System.out.println("deficient number");
				}else if(n < s) {
					System.out.println("abundant number");
				}
				
			}
			
			
	
		}
	}
}



