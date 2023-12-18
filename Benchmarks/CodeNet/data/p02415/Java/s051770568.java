import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line =  sc.nextLine();
		char[] chars = line.toCharArray();

		for(int i = 0;i < chars.length;i++) {
			if(Character.isUpperCase(chars[i])) {
				chars[i] = Character.toLowerCase(chars[i]);
			} else if (Character.isLowerCase(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
			}
			System.out.print(chars[i]);
		}
		System.out.println();

	}
}