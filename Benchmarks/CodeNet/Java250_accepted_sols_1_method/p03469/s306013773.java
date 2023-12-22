import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int i = Integer.parseInt(S.substring(0,4));
		int root = (int)Math.sqrt(i);
		System.out.println((i + 1) + S.substring(4)); 
	}
}
