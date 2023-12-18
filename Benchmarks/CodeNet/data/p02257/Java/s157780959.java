import java.util.Scanner;

public class Main {
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;
		int num = 0;
		int rem = 0;
		int n = 0;

		for (int i=0; i<N; i++) {
			num = sc.nextInt();
			n = 1;
			for (int j=2; j<num/2+1; j++){
				rem = num % j;
				if (rem==0) {
					n = 0;
					break;
				}
			}
			ans = ans+n;
		}
		System.out.println(ans);
	}
}
