import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long[] arr = new long[n+5];
		long ans = 0;
		for(int i=1;i<=n;i++) {
			arr[i]=sc.nextInt();
		}
		int r=0;
		long minAns=1000000000l;
		for(int i=1;i+k-1<=n;i++) {
			r=i+k-1;
			ans =  arr[r]-arr[i]+Math.min(Math.abs(arr[i]), Math.abs(arr[r]));
			if(ans<minAns) {
				minAns=ans;
			}
		}
		System.out.println(minAns);
	}
}
