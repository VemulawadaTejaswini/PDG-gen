import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int T = sc.nextInt();
		
		int q = N / X;
		int r = N % X;
		int s;
		if(r == 0) {
			s = q * T;
		}
		else {
			s = (q + 1) * T;
		}
		System.out.println(s);
	}
}