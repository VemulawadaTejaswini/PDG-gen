import java.util.Scanner;

public class Main {
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = 0;;
		int num = 0;
		int n;
		for (int i=0; i<N; i++) {
			num = sc.nextInt();
			n = Prime(num);
			ans = ans + n;
		}
		System.out.println(ans);
		
	}
	
	private static int Prime(int n){
		int rem;  /*remainder*/
		for (int i=2; i<n-1; i++){
			rem = n % i;
			if (rem==0) {
				return 0;
			}
		}
		return 1;
	}
}

