import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum=0;
		for(int i=0;i<n;i++) {
			
			int k=i+2;
			for(int j=i+1;j<n;j++) {
				
				 while(k<n && arr[i] + arr[j]>arr[k]) {
						k++;
				 }
				
					sum+=(k-1-j);
				
			}
		}
		
		System.out.println(sum);
		
	}
}
