import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	private static final Scanner S=new Scanner(System.in);
	private static final PrintStream O=System.out;
	private static final int N=3;
	private static final int A[]=new int[N];
	
	public static void main(String[] args) {
		for(int i=0;i<N;i++)
			A[i]=S.nextInt();
		Arrays.sort(A);
		for(int i=0;i<N-1;i++)
			O.print(A[i]+" ");
		O.println(A[N-1]);
	}
}