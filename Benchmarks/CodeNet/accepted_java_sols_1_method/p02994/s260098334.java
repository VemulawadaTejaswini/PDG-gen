import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt(), L = sc.nextInt();
			int[] taste = new int[N];
			int sum = 0;
			for(int i = 0; i < N; i++) {
				taste[i] = L + (i + 1) - 1;
				sum += taste[i];
			}
			int ans = 0, abs = Integer.MAX_VALUE;
			for(int i = 0; i < N; i++) {
				if(Math.abs(taste[i]) < abs) {
					abs = Math.abs(taste[i]);
					ans = sum - taste[i];
				}
			}
			System.out.println(ans);
		}
	}
}