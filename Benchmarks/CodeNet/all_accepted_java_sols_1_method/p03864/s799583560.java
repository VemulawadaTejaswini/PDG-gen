import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		
		int n = scanner.nextInt();
		long arr[] = new long[n];
		long a = scanner.nextLong();
		long count = 0;
		for(int i = 0 ;i<n ; i++){
			arr[i] = scanner.nextLong();
		}
		if(arr[0] > a){
			count += arr[0]-a;
			arr[0] = a;
		}
		for(int i = 1 ; i<n ; i++){
			if( arr[i]+arr[i-1] > a){
				count += arr[i-1] + arr[i] - a;
				arr[i] = a-arr[i-1];
			}
		}

		System.out.println(count);
	}
}