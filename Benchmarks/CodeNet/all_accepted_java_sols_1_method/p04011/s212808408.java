import java.util.*;
public class Main {
		
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		int r=N-K;
		int sum=0;
		if(N>K) {
			sum=(K*X)+(r*Y);
		}
		else {
			sum=(N*X);
		}
		System.out.println(sum);
	}
}