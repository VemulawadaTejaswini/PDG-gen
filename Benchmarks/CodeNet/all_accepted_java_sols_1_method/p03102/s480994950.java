import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt(); 
		int m = stdIn.nextInt();
		int c = stdIn.nextInt();
		
		int[] b = new int[m];
		
		for(int i = 0; i < m; i++) {
			b[i] = stdIn.nextInt();
		}
		
		int ans = 0;
		
		for(int i = 0; i <n; i++) {
			int[] a = new int[m];
			int cnt = 0;
			for(int j = 0; j < m; j++) {
				a[j] = stdIn.nextInt();
				cnt += a[j]*b[j];
			}
			if(cnt+c>0) {
				ans++;
			}
		}
		System.out.println(ans);
		
		
	}

}
