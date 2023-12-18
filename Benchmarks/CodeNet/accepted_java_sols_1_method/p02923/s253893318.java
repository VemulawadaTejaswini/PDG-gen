import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] h = new int[n];
		int count = 0;
		int max = 0;
		for(int i = 0; i < n; i++) {
			h[i] = sc.nextInt();
		}
		for(int i = 0; i < n-1; i++) {
			if( h[i] >= h[i+1]) {
				count++;
			}else if(count  != 0 &&  h[i] < h[i+1]) {
				max = Math.max(max, count);
				count = 0;
			}
		}
		max = Math.max(max, count);
		System.out.println(max);
		sc.close();

	}

}