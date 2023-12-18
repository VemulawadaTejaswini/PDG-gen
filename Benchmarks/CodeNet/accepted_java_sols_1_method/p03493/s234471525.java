import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		char[] s = sc.next().toCharArray();
		if (s[0] == '1') count++;
		if (s[1] == '1') count++;
		if (s[2] == '1') count++;
		System.out.println(count);
	}
}
