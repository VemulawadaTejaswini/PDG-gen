import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				double p = sc.nextDouble();
			
				if(n==0 && m==0 && p==0)	break;
				int gold = 0;
				int x[] = new int[n];
				for(int i=0; i<n; i++) {
					x[i] = sc.nextInt();
					gold += x[i]*100;
				}
				if(x[m-1] == 0) {
					System.out.println(0);
				}else {
					System.out.println((int)((gold-(gold*(p*0.01) ) )/x[m-1]));
				}
				
					
				
			}
			
			
			
			
				
		}
	}
}
