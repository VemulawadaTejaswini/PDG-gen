import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = 0;
		for(int i = 1;i <= N;i++) {
			int sum = 0;
			int k = i;
			while(k >= 1) {
				sum = sum + (k % 10);
				k = k  / 10; 
			}
			if(sum >= a && sum <= b) {
				ans += i;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
