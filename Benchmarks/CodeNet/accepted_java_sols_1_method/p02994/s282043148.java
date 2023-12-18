import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), l = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		for(int i = 1; i <= n; i++) {
			int x = i + l - 1;
			if(Math.abs(x) < min) {
				minIndex = i;
				min = Math.abs(x);
			}
			sum += x;
		}
		
		System.out.println(sum - (l + minIndex - 1));
		
	}
}
