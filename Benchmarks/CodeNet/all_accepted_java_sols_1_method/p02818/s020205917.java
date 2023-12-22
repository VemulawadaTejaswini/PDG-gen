import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		scan.close();
		long A = Long.parseLong(a);
		long B = Long.parseLong(b);
		long K = Long.parseLong(c);

		if(K == 0) {
		System.out.print(A);
		System.out.print(" ");
		System.out.print(B);
		}
		if(A + B < K) {
		System.out.print(0+" "+0);
		K = 0;
		}
		if(K != 0) {
		if(A < K) {
		System.out.print(0 + " ");
		K = K-A;
		}else{
		System.out.print(A-K+" "+B);
		K = 0;
		}
		}

		if(K > 0) {
		System.out.print(B-K);
		}

	}

}
