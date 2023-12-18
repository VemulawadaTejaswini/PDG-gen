import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		long[] map = new long[N];
		for (int i = 0; i < N; i++) {
			map[i] = sc.nextLong();
		}
		
		int ans = 0;
		for (int i = 0; i < N; i++) {
			long val = map[i];
			while(val % 2 == 0) {
				ans++;
				val /= 2;
			}
		}
		
		System.out.println(ans);
	}
	
}
