import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		double log;
		log = Math.log10(N) / Math.log10(K);
		int ans = (int)Math.floor(log) + 1;
		
		System.out.println(ans);


	}
}
