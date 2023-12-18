import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0;i < n;i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		int minInt = 0;
		
		
		for(int j = 0;j < n;j++) {   //最小値を求める工程
			if(j == 0) {
				minInt = a[j];

				
			}else {
				if(a[j] < minInt) {
					minInt = a[j];

					
				}
				
			}
			
		}
		
		int maxInt = 0;

		
		
		for(int k = 0;k < n;k++) {   //最大値を求める工程
			if(k == 0) {
				maxInt = a[k];

				
			}else {
				if(a[k] > maxInt) {
					maxInt = a[k];

					
				}
				
			}
			
		}
		
		long sum = 0;
		
		for(int l = 0;l < n;l++) {
			sum = sum + a[l];
			
		}
		
		System.out.println(minInt + " " + maxInt + " " + sum);
		
				
	}
}
