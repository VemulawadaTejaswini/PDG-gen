
import java.util.*;
class Solution {
public static int mod=1000000007;

int N;

	
	

	public static void main(String[] args) {
			
	Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		
		double arr[]=new double[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextDouble();
		
		int pairs=0;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				double prod=arr[i]*arr[j];
				if(prod%1==0)
					pairs++;

						}
		}
		System.out.println(pairs);
		
	
	
		
		
		
		
	
		
		
		
	}
	
	
	
		}
	
	
	
	
		
	
	

		
		

	
	
	
	

			
	
		
	
	
		
	
	
	
	
	


