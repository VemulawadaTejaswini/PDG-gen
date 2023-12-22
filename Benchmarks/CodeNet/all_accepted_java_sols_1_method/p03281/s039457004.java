import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int ans=0;
		for(int i=1;i<=n;i+=2){
			int cnt=0;
			for(int j=i;j>0;j--){
				if(i%j==0)cnt++;
			}
			if(cnt==8)ans++;
		}
		
		System.out.println(ans);
	}
}
