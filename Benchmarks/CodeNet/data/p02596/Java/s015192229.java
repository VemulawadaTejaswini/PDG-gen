import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		if (K % 2 == 0) {
			System.out.println(-1);
		} else {
			double num = 7;
			int count = 1;
			while (num % K != 0) {
				num = num * 10 + 7;
				count++;
			}
			
			System.out.println(count);
		}
	}
}
