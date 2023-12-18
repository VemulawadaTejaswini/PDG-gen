import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long A=stdIn.nextLong();
		long B=stdIn.nextLong()+A;
		long C=0;
		C=N/B;
		N-=C*B;
		if(A>=N)
			System.out.println(C*A+N);
		else
			System.out.println(C*A+A);
	}
}
