import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int N;
		N=scan.nextInt();
		int kisu;
		kisu=N/2;
		if(N%2==1)kisu++;
		double A;
		A=(double)kisu/(double)N;
		System.out.print(A);
		
		
	}
}