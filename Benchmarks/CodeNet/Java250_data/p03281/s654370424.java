import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a =0;
		int counter = 0;

		for (int n=1; n<=N;n=n+2){
			a = 0;
			for ( int j=1;j<=n;++j){
				if (n%j == 0) ++a;
			}
			if (a == 8) ++ counter;
		}

		System.out.println(counter);

	}

}