import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int[] key = new int[n];
		for(int i = 1; i <=n; i++) {
			key[i-1] = i;
		}
		int judge1 = -1;
		int judge2 = Integer.MAX_VALUE;
		for(int i = 0; i < m; i++) {
			int temp1 = sc.nextInt();
			int temp2 = sc.nextInt();
			if(temp1 > judge1) {
				judge1 = temp1;
			}
			if(temp2 <judge2) {
				judge2 = temp2;
			}
		}
		for(int i = 0; i < n; i++) {
			if(key[i] >= judge1 && key[i] <= judge2) {
				count++;
			}
		}
		System.out.println(count);
	}
}