import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), K = sc.nextInt();
		char[] S = sc.next().toCharArray();
		S[K - 1] -= 'A' - 'a';
		System.out.println(String.valueOf(S));
	}
}