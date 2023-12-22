import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		int ans=1;
		for(int i=2;i*i<=X;i++) {
			for(int j=i*i;j<=X;j*=i) {
				ans=Math.max(ans,j);
			}
		}
		System.out.println(ans);
		sc.close();
	}
}