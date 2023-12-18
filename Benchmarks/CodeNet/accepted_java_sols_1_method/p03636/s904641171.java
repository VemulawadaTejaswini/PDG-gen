import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strBegin = str.substring(0, 1);
		String strEnd = str.substring(str.length()-1, str.length());
		int count = str.length() - 2;
		System.out.println(strBegin + count + strEnd);
	}

}
