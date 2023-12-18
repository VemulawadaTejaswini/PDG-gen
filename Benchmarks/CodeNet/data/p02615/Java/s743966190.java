import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		long sum=0;

		long a =0;
		long b=1000000000;

		for (int i = 0; i < N; i++) {
			a=sc.nextInt();
			sum+=a;
			if(a<b) {
				b=a;
			}
		}

		sum-=b;

			System.out.println(sum);


	}
}