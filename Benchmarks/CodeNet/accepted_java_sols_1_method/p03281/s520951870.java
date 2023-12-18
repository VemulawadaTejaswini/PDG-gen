import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int ans=0;
		for(int i=1;i<=N;i+=2) {
			int count=0;
			for(int n=1;n<=i;n++) {
				if(i%n==0)count++;
			}
			if(count==8) ans++;
		}
		System.out.println(ans);
	}
}
