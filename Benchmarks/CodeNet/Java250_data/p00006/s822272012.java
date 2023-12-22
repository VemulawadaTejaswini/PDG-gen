import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String str =new Scanner(System.in).nextLine();
		String[] str1 = str.split("");
		String[] str2 = new String[str1.length];
		for (int i = str1.length - 1; i >= 0; i--) {
			str2[str1.length - i - 1] = str1[i];
		}
		String str3 ="";
		for (int i = 0; i < str2.length; i++) {
			str3=str3+str2[i];
		}
		System.out.println(str3);
	}

}