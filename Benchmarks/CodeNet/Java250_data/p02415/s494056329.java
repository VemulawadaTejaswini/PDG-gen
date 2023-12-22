
public class Main {
	public static void main(String[] args) {
		String input = new java.util.Scanner(System.in).nextLine();
		char serch; String str = "";
		for (int i = 0; i < input.length(); i++) {
			serch = input.charAt(i);
			if (Character.isLowerCase(serch)) {
				serch = Character.toUpperCase(serch);
			} else if (Character.isUpperCase(serch)) {
				serch = Character.toLowerCase(serch);
			}
			str += serch;
		}
		System.out.println(str);
	}

}