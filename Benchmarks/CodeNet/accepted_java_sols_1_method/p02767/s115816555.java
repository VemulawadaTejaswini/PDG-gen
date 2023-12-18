import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int[] x = new int[n];
		int cnt = 0;
		for(int i = 0;i < n; i++) {
			x[i] = stdIn.nextInt();
			cnt += x[i];
		}
		int a =(int) Math.round((double)cnt/n);
		int ans = 0;
		for(int i = 0; i < n; i++) {
			ans += (a-x[i])*(a-x[i]);
		}
		System.out.println(ans);
		
	}

}
