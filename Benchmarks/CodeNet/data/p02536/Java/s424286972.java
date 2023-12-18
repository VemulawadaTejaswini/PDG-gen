import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int hako[] = new int [n];
		for(int i=0;i<m;i++) {
			for(int j=1;j<=2;j++) {
				int a = sc.nextInt()-1;
				if(hako[a]!=2) {
					hako[a]++;
					ans++;
				}
			}
		}
		
		if(n<=3) {
			System.out.println(n-m-1);
			return;
		}
		int hasi=0;
		if(ans<=n*2-2) {
			hasi=(n*2-2)-ans;
			System.out.println(hasi);
		}
		else {
			System.out.println(hasi);
		}
		
	}
}
