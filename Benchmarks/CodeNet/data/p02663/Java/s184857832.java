
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int  H1=sc.nextInt();
		int  M1=sc.nextInt();
		int  H2=sc.nextInt();
		int  M2=sc.nextInt();
		int  K=sc.nextInt();
		int ans=0;

		int A=H2*60+M2;
		int B=H1*60+M1;

		ans=A-B-K;

		System.out.println(ans);



		sc.close();

	}

}
