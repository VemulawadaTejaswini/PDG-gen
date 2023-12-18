import java.util.Scanner;

public class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		int A =sc.nextInt();
		int B =sc.nextInt();
		int C =sc.nextInt();
		int D =sc.nextInt();
		int sum1=0,sum2=0;
		sum1=A*B;
		sum2=D*C;
		if(sum1>sum2)System.out.println(sum1);
		else if(sum1<=sum2)System.out.println(sum2);
		
	}

}