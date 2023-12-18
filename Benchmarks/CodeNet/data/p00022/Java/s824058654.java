import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int num = stdIn.nextInt();
			if(num == 0) break;
			int[] data = new int[num + 1];
			int sum = 0;
			int ans = Integer.MIN_VALUE;
			for(int r = 0; r < num; r++) {
				int input = stdIn.nextInt();
				sum += input;
				data[r + 1] = sum;
				ans = Math.max(ans, input);
			}
			for(int r = 0; r <= num; r++) {
				for(int c = r + 1; c <= num; c++) {
					ans = Math.max(ans, data[c] - data[r]);
				}
			}
			System.out.println(ans);
		}
	}
}