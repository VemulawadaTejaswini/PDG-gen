import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();
		
		
		long []num = new long [1000001];
		
		for(int i = 0; i < n ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			num[a] += b;
		}
		
		long sum = 0;
		int ans = 0;
		
		for(int i = 1 ; i < 1000001 ; i++) {
			sum += num[i];
			if(sum >= k) {
				ans = i;
				break;
			}
		}
		
		System.out.println(ans);
		
		
	}

}
