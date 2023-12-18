import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (N%2==1) {
			System.out.println("No");
			return ;
		}
		String s = sc.next();
		for (int i=0;i<s.length()/2;i++) {
			if (s.charAt(i)!=s.charAt(N/2+i)) {
				System.out.println("No");
				return ;
			}
		}
		System.out.println("Yes");
		return ;
	}
}