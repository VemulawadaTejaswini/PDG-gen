import java.util.Scanner;

public class Main {
	public static final int number=753;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		int max=Integer.MAX_VALUE;
		for(int a = 0; a<=S.length()-3;a++) {
			int k = Integer.parseInt(S.substring(a, a+3));
			max=Math.min(max, Math.abs(k-number));
		}
		System.out.println(max);
	}

}
