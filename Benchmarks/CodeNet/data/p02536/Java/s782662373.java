import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int ans=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int hako[] = new int [n];
		for(int i=0;i<m;i++) {
			int a = sc.nextInt()-1;
			int b = sc.nextInt()-1;
			if(hako[a]!=2 && hako[b]!=2) {
				hako[a]++;
				hako[b]++;
				ans+=2;
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
