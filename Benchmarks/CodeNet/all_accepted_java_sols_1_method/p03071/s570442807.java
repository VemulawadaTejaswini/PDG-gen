import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int A=sc.nextInt();
		int B=sc.nextInt();

		int ans=0;

		if(A>B) ans=A+A-1;
		else if(A<B) ans=B+B-1;
		else {
			if(A-1<B) ans=A+B;
			else ans=A+A-1;
		}
		System.out.println(ans);

		sc.close();
	}

}
