import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int sec = 0;
		if(A > C) {
			int x = A;
			A = C;
			C = x;
			x = B;
			B = D;
			D = x;
		}
		if(B < C) System.out.println(sec);
		else if(B < D){
			sec = B - C;
			System.out.println(sec);
		}else{
			sec = D - C;
			System.out.println(sec);
		}
	}
}