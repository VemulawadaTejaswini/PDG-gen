import java.util.Scanner;

public class Main {
	
	static boolean findSum(int [] arr, int n, int sum) {
		if(sum == 0) {
			
			return true;
		}
		
		 if(n == 0 && sum != 0) {
			
			return false;
		}
		
		if(arr[n - 1] > sum) {
			return findSum(arr, n - 1, sum);
		}
		
		else {
			return findSum(arr, n - 1, sum) || findSum(arr, n-1, sum - arr[n - 1]);
		}
	}
	
	public static void main(String [] args) {
	
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0; i < n; i ++) {
			arr[i] = in.nextInt();
		}
		
		int q = in.nextInt();
		
		int [] sums = new int [q];
		for(int i = 0; i < q; i++) {
			sums[i] = in.nextInt();
		}
		
		for(int i = 0; i < q; i++) {
			if(findSum(arr, arr.length, sums[i])) {
				System.out.println("yes");
			}
			
			else {
				System.out.println("no");
			}
		}
		
		
	}
}

