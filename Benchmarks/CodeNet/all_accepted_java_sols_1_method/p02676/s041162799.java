import java.util.Scanner;

public class Main {
	static int K;
	static String S;
	static int s;
	static String x;
	public  static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		K=sc.nextInt();
		S=sc.next();
		s=S.length();
		if(K>=s) {
			System.out.println(S);
		}
		else {
			x=S.substring(0,K);
			System.out.println(x+"...");
		}
	}
}