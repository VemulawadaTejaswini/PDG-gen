import java.util.Scanner;
 
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long judge = (long) Math.pow(10,18);
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			if(a > judge) {
				System.out.println(-1);
				return;
			}
			ans *= a;
			if(ans >judge) {
				System.out.println(-1);
				return;
			}
		}
		
		System.out.println(ans);
	}
}