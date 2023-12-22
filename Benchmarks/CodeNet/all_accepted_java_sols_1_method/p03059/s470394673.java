import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();
		int T=sc.nextInt();

		int ans=0;

		int t=0;

		while(true) {

			t+=A;
			if(T+0.5<=t) break;

			ans+=B;

		}

		System.out.println(ans);

		sc.close();

	}

}
