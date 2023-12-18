import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();
		int x = 0;
		int num = 0;
		for(int i = 0;i < N;i++) {
			num = S.charAt(i)=='I' ? ++num : --num;
			x = Math.max(x, num);
		}
		System.out.println(x);
	}
}