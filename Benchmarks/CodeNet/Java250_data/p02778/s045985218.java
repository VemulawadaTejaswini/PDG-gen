import java.util.Scanner;

public class Main {
	static String A = "";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int n = word.length();
		for(int i = 0; i < n; i++)
			A += 'x';
		System.out.print(A);
		
	}
}