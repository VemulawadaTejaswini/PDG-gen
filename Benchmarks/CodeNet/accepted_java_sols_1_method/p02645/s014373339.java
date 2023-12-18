import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] name = new char[3];

		String ret = "";
		name[0] = s.charAt(0);
		name[1] = s.charAt(1);
		name[2] = s.charAt(2);

		ret = new String(name);
		System.out.println(ret);

		sc.close();
	}
}

