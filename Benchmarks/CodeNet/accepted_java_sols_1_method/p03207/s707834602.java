import java.util.Scanner;

class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int ans = 0;
		int max = 0;
		for (int i = 0; i < N; i++) {
			int pi = sc.nextInt();
			max = Math.max(pi, max);
			ans += pi;
		}
		
		System.out.println(ans - max + (max / 2));
	}
	
}