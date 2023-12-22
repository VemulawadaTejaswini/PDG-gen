import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int indexA = 0;
		int indexZ = 0;
		boolean top = true;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals("A") && top) {
				indexA = i;
				top = false;
			}
			if (s[i].equals("Z"))
				indexZ = i;
		}
		System.out.println(indexZ - indexA + 1);
	}
}