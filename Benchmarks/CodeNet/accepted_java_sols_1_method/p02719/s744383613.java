import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long N=stdIn.nextLong();
		long K=stdIn.nextLong();
		long A=N%K;
		long B=K-A;
		System.out.println(Math.min(A,B));
	}
}
