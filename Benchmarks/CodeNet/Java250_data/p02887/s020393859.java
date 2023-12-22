import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.next();
		int r = 1;
		char[] str = sc.next().toCharArray();
		sc.close();
		for (int i = 0; i < str.length - 1; i++) {
			if(str[i] != str[i + 1]) ++r;
		}
		System.out.println(r);
	}
}