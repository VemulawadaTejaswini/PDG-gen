import java.util.Scanner;
public class Main {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		int [] arr = new int [n];
		int [] maxArr = new int [n];
		maxArr[n - 1] = arr[n - 1];
		int maxVal = Integer.MIN_VALUE;
		
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		
		for(int j = n - 1; j > 0; j--) {
			
			 maxArr[j - 1] = Math.max(arr[j], maxArr[j]);
			 
			 if(maxArr[j] - arr[j] > maxVal) {
				 maxVal = maxArr[j] - arr[j];
			 }
			 	
	}
		
		System.out.println(maxVal);
		
		

	}
}

