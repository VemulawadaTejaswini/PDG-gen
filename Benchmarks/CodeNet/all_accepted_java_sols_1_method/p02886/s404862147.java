import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] d = new int[n];
		int ans = 0;
		
		//美味しさ配列
		for(int i = 0; i < n; i++) {
			d[i] = sc.nextInt(); 
		}

		for(int i = 0; i < n-1; i++) {
			for(int j = i+1; j < n; j++){
				ans += d[i] * d[j];
			}
		}
		System.out.println(ans);
	}
}