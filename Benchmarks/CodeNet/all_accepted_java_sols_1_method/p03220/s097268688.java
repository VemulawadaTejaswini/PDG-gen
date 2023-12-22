import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int T = Integer.parseInt(sc.next());
		double A = Integer.parseInt(sc.next());

		double num = 0;
		double Kinji = Math.pow(5,10)+1;
		int ans = 1;
		for(int i=0; i<N;i++) {
			num = Integer.parseInt(sc.next())*0.006;
			num = T - num;
			num = Math.abs(num-A);

			if(num < Kinji) {
				Kinji = num;
				ans = i+1;
			}
		}

		System.out.println(ans);

	}

}