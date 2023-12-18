import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		long mod = (long)(1e9+7);
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int K = input.nextInt();
		long answer=0;
		while (K>0) {
			if (A>0) {
				int sub = Math.min(A, K);
				K-=sub;
				A-=sub;
				answer+=sub;
			}else if (B>0) {
				int sub = Math.min(B, K);
				K-=sub;
				B-=sub;
			}else if (C>0) {
				int sub = Math.min(C, K);
				K-=sub;
				C-=sub;
				answer-=sub;
			}
			if (A<=0&&B<=0&&C<=0) break;
		}
		System.out.println(answer);
	}
}