import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		int min = Integer.MAX_VALUE;
		for (int i = 2; i < s.length; i++) {
			int x = (s[i-2]-'0')*100+(s[i-1]-'0')*10+(s[i]-'0');
			min = Math.min(min,Math.abs(753-x));
		}
		System.out.println(min);
		sc.close();
	}
}