import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		/*int hako[]=new int[n];
		for(int i=0;i<n;i++) {
			hako[i]=sc.nextInt();
		}*/
		int ans=0;
		for(int i=l;i<=r;i++) {
			if(i%n==0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
