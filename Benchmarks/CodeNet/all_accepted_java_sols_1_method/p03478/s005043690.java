import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		int total = 0;
		
		for(int i = 1; i <= N; i++) {
			String is = String.valueOf(i);
			int sum = 0;
			int k = 0;
			for(int j = 1; j <= is.length(); j++) {
				k = (int)(i / (int)Math.pow(10, j - 1)) % 10;
				sum += k;
			}
			if(A <= sum && sum <= B) {
				total += i;
			}
		}
		System.out.println(total);
	}
}
