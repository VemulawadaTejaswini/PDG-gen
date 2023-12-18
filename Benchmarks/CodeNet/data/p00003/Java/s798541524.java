import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int N;
		int a;
		int b;
		int c;
		int A;
		int B;
		int C;
		while(scan.hasNext()){
			N = scan.nextInt();
			for(int d = 0;d<N;d++){
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
}