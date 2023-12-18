import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int len = stdIn.nextInt();
		int[] num = new int[len];
		int sum = 0;
		for (int i = 0; i < len; i++) {
			num[i] = stdIn.nextInt();
			sum += num[i];
		}
		
		for (int i = 0; i < len - 1; i++) {
			if (num[i] > num[i+1]) {
				int t = num[i];
				num[i] = num[i + 1];
				num[i + 1] = t;
			}
			
		}
		
		System.out.println(num[0] + " " + num[len - 1] + " " + sum);
	}
}

