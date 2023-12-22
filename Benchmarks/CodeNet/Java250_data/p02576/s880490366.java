import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();
		int m=0;
		int ans=0;
		
		while(0<N) {
			N = N - x;
			m++;
		}
		ans = t*m;
		System.out.println(ans);
		sc.close();
		
	}

}
