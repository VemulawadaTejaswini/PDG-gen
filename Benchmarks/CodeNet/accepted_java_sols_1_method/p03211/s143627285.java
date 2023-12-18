import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] S2 = S.split("");
		String[] S3 = new String[S.length()];
		for(int i=0; i<S3.length; i++) {
			S3[i]= "";
		}
		int n = 753;
		int sum = 0;
		int ans = 100000000;
		for(int i=0; i<S2.length-2; i++) {
			for(int j = i; j<i+3; j++) {
				S3[i] += S2[j];
			}
			sum = Integer.parseInt(S3[i]);
			if(ans>Math.abs(n-sum)) {
			  ans = Math.abs(n-sum);
			}
			sum = 0;
		}
		System.out.println(ans);
	}
}