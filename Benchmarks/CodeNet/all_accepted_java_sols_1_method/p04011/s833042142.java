import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		
		if (N <= K)
			System.out.println(N*X);
		else 
			System.out.println((K*X)+(Y*(N-K)));	
	}
}