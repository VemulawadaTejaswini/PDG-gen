package class2nd;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int n,i;
		int sum=0;
		double syg;
		int[] data;
		data = new int[1000];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			n=sc.nextInt();
			if (n==0) {
				break;
			}
			for (i=0 ; i<n ; i++) {
				data[i]=sc.nextInt();
				sum += data[i]^2;
			}
			syg = Math.sqrt((double)sum/(double)n);
			System.out.println(""+syg);
		}
		
		sc.close();
	}	
}
