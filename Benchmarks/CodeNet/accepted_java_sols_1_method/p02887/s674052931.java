import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		int count=1;
		for (int i=1;i<s.length();i++) {
			if (s.charAt(i)!=s.charAt(i-1)) {
				count ++;
			}
		}
		System.out.println(count);
	}
}