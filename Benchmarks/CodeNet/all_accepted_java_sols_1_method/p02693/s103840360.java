import java.util.Scanner;

public class Main {
	static int K;
	static int A;
	static int B;
	static int a;
	static int b;
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		K=sc.nextInt();
		A=sc.nextInt();
		B=sc.nextInt();
		a=A/K;
		b=B/K;
		if(a!=b) {
			System.out.println("OK");
		}
		else if(a==b&&A%K==0) {
			System.out.println("OK");
		}
		else if(a==b&&B%K==0) {
			System.out.println("OK");
		}
		else {
			System.out.println("NG");
		}
	}
}
