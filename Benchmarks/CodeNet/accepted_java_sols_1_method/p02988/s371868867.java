import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		
		int cnt = 0;
		for(int i = 1; i < n-1; i++) {
			if(p[i-1]<p[i] && p[i]<p[i+1] || p[i-1]>p[i] && p[i]>p[i+1]) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
