import java.util.Scanner;

public class Main {
	public static final String OK = "Yay!";
	public static final String NO = ":(";
	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] abcde = new int[5];
		abcde[0] = sc.nextInt();
		abcde[1] = sc.nextInt();
		abcde[2] = sc.nextInt();
		abcde[3] = sc.nextInt();
		abcde[4] = sc.nextInt();
		int k = sc.nextInt();
		sc.close();
		for(int i = 0; i < 5; i++) {
			int idx = i;
			for(int j = 0; j < 5; j++) {
				int p = abcde[idx];
				int q = abcde[j];
				if(i != j && Math.abs(p - q) > k) {
					System.out.println(NO);
					return;
				}
			}
		}
		System.out.println(OK);
	}
}