import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A,B,C,K;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		K=sc.nextInt();
		int max=A;
		if(A>=K) {
			max = K;
		}
		else if(A+B>=K) {
			max=A;
		}else {
			max=A-(K-A-B);
		}
		System.out.println(max);
		
	}
}



