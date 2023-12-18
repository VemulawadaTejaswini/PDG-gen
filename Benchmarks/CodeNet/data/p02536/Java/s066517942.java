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
			hako[a]++;
			hako[b]++;
		}
		for(int i=0;i<n;i++) {
			if(hako[i]<=2){
				ans+=hako[i];
			}
			else {
				ans+=2;
			}
		}
		int amari=ans%2;
		ans-=amari;
		
		
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
