import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int ans = 0;
		if(B <= C || D <= A) {
			ans = 0;
		} else if(C <= A && A <= D && D <= B){
			ans = D - A;
		} else if(C <= A && B <= D) {
			ans = B - A;
		} else if(A <= C && C <= B && D <= B) {
			ans = D - C;
		} else if(A <= C && C <= B && B <= D) {
			ans = B - C;
		}
		System.out.println(ans);
	}
}
