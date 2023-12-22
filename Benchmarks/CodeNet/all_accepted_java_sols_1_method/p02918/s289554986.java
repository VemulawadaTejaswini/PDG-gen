import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		int happy=0;
		for(int i=0; i<N-1; i++) {
			if(S.charAt(i)==S.charAt(i+1)) {
				happy ++;
			}
		}
		int ans = Math.min(happy+2*K, N-1);
		System.out.println(ans);
	}
}