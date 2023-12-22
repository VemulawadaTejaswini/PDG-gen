import java.util.Scanner;

public class Main {
	static int[] subTreeSize;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		k--;
		int idx = 0;
		for (;idx < s.length() && s.charAt(idx) == '1'; idx++);
		char ans = k < idx ? '1' : s.charAt(idx);
		System.out.println(ans);
	}
}
