import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		String S = sc.next();
		sc.close();

		S = S.substring(A-1,Math.max(C,D));
		String ans = "";
		if(S.contains("##")) {
			ans = "No";
		}else if(C < D) {
			ans = "Yes";
		}else {
			if(S.substring(B-2,D+1).contains("...")) {
				ans = "Yes";
			}else {
				ans = "No";
			}
		}
		System.out.println(ans);
	}
}