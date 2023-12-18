import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		for(int d = 0;d<n;d++){
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			A = a*a;
			B = b*b;
			C = c*c;
			if(A+B==C || B+C==A || C+A==B){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
		}
	}
}