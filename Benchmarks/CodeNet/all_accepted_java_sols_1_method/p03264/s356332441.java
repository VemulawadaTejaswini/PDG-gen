import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for(int i=2; i<=n;i+=2) {
			for(int j=1;j<=n; j+=2) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}