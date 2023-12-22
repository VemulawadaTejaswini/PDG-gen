import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] SSplit = S.split("");
		int res = Integer.MAX_VALUE;
		for (int i = 0; i < SSplit.length - 2; i++) {
			int num = Integer.parseInt(SSplit[i] + SSplit[i + 1] + SSplit[i + 2]);
			if (Math.abs(num - 753) < res) {
				res = Math.abs(num - 753);
			}
		}
		System.out.print(res);
	}
}