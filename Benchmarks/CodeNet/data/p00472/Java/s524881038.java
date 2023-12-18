import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < n-1; i++) {
			list[i+1] = list[i] + sc.nextInt();
		}
		int now = 0;
		int sum = 0;
		for(int i = 0; i < m; i++) {
			int to = sc.nextInt();
			sum += Math.abs(list[now] - list[now + to]);
			sum %= 100000;
			now = now + to;
		}
		System.out.println(sum % 100000);
		
	}
	
	
	
}