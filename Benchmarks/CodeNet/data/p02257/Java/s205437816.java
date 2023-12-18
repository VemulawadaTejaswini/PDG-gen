import java.util.Scanner;

public class Main {
	
	public static void  main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int ans = N;
		int num = 0;
		int rem = 0;

		for (int i=0; i<N; i++) {
			num = sc.nextInt();
			if (num == 2){
				continue;
			}
			else if (num % 2 ==0){
				ans--;
				continue;
			}
			for (int j=3; j<num/2; j+=2){
				if (num%j==0) {
					ans--;
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
