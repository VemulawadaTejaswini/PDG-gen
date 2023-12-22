import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 
		int A,B,C,K;
		A=sc.nextInt();
		B=sc.nextInt();
		C=sc.nextInt();
		K=sc.nextInt();
		int sum=A;
		if(A>=K) {
			sum = K;
		}
		else if(A+B>=K) {
			sum=A;
		}else {
			sum=A-(K-A-B);
		}
		System.out.println(sum);
		
	}
}
 
 
 