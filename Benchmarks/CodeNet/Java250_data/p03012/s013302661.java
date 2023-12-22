import java.util.Scanner;
import java.lang.Math;

public class Main {
	
	int sum(int[] a, int[] b) {
		
		
		return 0;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int[] sumForward = new int[n];
		sumForward[0] = arr[0];
		for(int i = 1;i<n;i++) {
			sumForward[i] = sumForward[i-1]+arr[i];
		}
		int[] sumBackward = new int[n];
		sumBackward[n-1] = arr[n-1];
		for(int i = n-2; i>=0;i--) {
			sumBackward[i] = sumBackward[i+1]+arr[i];
		}
		int min = Math.abs(sumForward[0] - sumBackward[1]);
		for(int i = 0 ;i<n-1;i++) {
			if(min>Math.abs(sumForward[i]-sumBackward[i+1])) {
				min = Math.abs(sumForward[i]-sumBackward[i+1]);
			}
		}
		System.out.println(min);
	}

}
