import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hako[]=new int[n];
		for(int i=1;i<=n;i++) {
			//hako[i]=sc.nextInt();
			int masu = sc.nextInt();
			if(masu%2==1 && i%2==1) {
				ans++;
			}
		}
		
		System.out.println(ans);
	}
}
