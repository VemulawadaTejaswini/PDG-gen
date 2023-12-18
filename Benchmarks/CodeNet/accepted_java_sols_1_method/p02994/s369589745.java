import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] arr  = new int[n];
		int sum = 0;
		for(int i=1;i<=n;i++) {
			arr[i-1]=l+i-1;
			sum = sum+arr[i-1];
		}
		int min = Integer.MAX_VALUE;
		int y = 0;
		for(int j=0;j<n;j++) {
			if(Math.abs(sum-(sum-arr[j]))<min) {
				min = Math.abs(sum-(sum-arr[j]));
				y=j;
				
			}
		}
		
		System.out.println(sum-arr[y]);

	}

}
