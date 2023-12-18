import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		char[] b = s.toCharArray();
		int count = 0;
		for (char a1 : a) {
			count = 0;
			for (char b1 : b) {
				if(a1 == b1)count++;
			}
			if(count == 2) break;
		}
		if(count == 2)System.out.println("no");
		else System.out.println("yes");
	}
}
