import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String[] list = S.split("", 0);

		if (list[2].equals(list[3])  & list[4].equals(list[5])) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}