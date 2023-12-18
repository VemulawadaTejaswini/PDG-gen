import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		long N;

		N=sc.nextLong();

		long min_move=1000000000000001l;

		for(int i=0;i<5;i++) {
			long temp=sc.nextLong();
			if(min_move>temp) min_move=temp;
		}

		long ans=((N+min_move-1)/min_move)+4;

		System.out.println(ans);


		sc.close();

	}
}
