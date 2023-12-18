import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.nextLine().toCharArray();
		for(int i=0; i<str.length; i++) {
			str[i] = Character.toUpperCase(str[i]);
		}
		System.out.println(str);
	}
}

