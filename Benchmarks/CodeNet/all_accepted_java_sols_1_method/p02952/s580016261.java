import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++) {
			int cnt=0;
			int num=i;
			while(num>0) {
				cnt++;
				num/=10;
			}
			if(cnt%2!=0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}