import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		boolean ok = false;
		if(A == B && C != A)
			ok = true;
		else if(A == C && C != B)
			ok = true;
		else if(B == C && A != B)
			ok = true;
		System.out.println(ok ? "Yes" : "No");

	}

}