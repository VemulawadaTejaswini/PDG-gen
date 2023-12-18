import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int p = sc.nextInt();
			
				if(n==0 && m==0 && p==0)	break;
			
				int x[] = new int[n];
				for(int i=0; i<n; i++) {
					x[i] = sc.nextInt();
				}
				if(x[m-1] == 0) {
					System.out.println(0);
				}else {
					double gold = x[m-1]*100;
					double haitou = (gold + (gold * p/100))/x[m-1];
					System.out.println((int)haitou);
				}
				
					
				
			}
			
			
			
			
				
		}
	}
}
