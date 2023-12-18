import java.util.Scanner;
public class Main {
	
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		
		int [] arr = new int [n];
		
		
		int maxVal = Integer.MIN_VALUE;
		
		
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		int biggestNum = arr[n - 1];
		
		for(int j = n - 1; j > 0; j--) {
			
			 biggestNum = Math.max(arr[j], biggestNum);
			
			 
			 if(biggestNum - arr[j - 1] > maxVal) {
				 maxVal = biggestNum - arr[j - 1];
			 }
			 	
	}
		
		System.out.println(maxVal);
		
		

	}
}

