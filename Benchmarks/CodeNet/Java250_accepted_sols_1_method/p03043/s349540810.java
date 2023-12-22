import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());

		double s=0;
		int p=0;
		double k=1;
		for(int i=1;i<=N;i++) {

			k=1;
			for(p=i;p<K;) {

				p *= 2;
				k/=2;

			}
			s+=k;
		}


		s*=(double)1/N;
		System.out.println(s);

	}
}