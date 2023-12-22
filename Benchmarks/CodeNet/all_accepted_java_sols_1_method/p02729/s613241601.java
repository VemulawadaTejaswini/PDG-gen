import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N,M;
		int sum=0;
		N=cin.nextInt();
		M=cin.nextInt();
		sum=N*(N-1)/2+M*(M-1)/2;
		System.out.println(sum);
	}

}
