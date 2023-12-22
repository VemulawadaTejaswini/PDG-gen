import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] str = s.next().toCharArray();
		for(int i = str.length - 1; 0 <= i; --i) {
			System.out.print(str[i]);
		}
		System.out.println();
	}
}