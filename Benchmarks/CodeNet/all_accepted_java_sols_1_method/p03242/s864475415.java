import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		for (char c : ary) {
			if(c == '1') System.out.print(9);
			else System.out.print(1);
		}
		System.out.println();
	}
}