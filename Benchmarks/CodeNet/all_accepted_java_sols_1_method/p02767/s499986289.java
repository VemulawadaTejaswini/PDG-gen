//package atcoder;
 
import java.util.*;
import java.math.BigDecimal;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X[] = new int[N];
		int P = 0;
		for(int i=0;i<N;i++) {
			X[i] = sc.nextInt();
			P = (P+X[i]);
		}
		double avg = (double)P/N;
		//System.out.println(avg);
		int zahyou = (int)Math.floor(avg);
		//System.out.println(zahyou);
		int zahyou2 = (int)Math.ceil(avg);
		//System.out.println(zahyou2);

		int souwa = 0;
		int souwa2 = 0;
	
		for(int j=0;j<N;j++) {
			souwa = (int) (souwa + Math.pow((X[j]-zahyou),2));
			souwa2 = (int) (souwa2 + Math.pow(X[j]-zahyou2, 2));
			}
		System.out.println(Math.min(souwa, souwa2));
		}
}