import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = Integer.parseInt(in.nextLine());
		String s = in.nextLine();
		String t = in.nextLine();
		in.close();
		int mth = 0;
		for (int i = 0; i < num; i++) {
			if (s.substring(i, num).equals(t.substring(0, num-i))) {
				mth = num - i;
				break;
			}
		}
		System.out.println(num * 2 - mth);
	}

}
