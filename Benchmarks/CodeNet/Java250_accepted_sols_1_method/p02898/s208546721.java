import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),K=sc.nextInt();
		int ans=0;

		for(int i=0;i<N;i++) {
			int h=sc.nextInt();
			if(h>=K) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}