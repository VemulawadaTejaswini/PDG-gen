import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long Q = sc.nextLong();
		long H = sc.nextLong();
		long S = sc.nextLong();
		long D = sc.nextLong();
		long N = sc.nextLong();
		long C;
		
		H=Math.min(2*Q, H);
		S=Math.min(2*H, S);
		
		if(2*S<D) {
			C=S*N;
		}
		else {
			C=N/2*D+N%2*S;
		}
		System.out.println(C);
	}
}
