import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String ans = "No";
		if(A == B && A != C || A == C && A != B || C == B && C != A){
			ans = "Yes";
		}
		System.out.println(ans);
	}
}