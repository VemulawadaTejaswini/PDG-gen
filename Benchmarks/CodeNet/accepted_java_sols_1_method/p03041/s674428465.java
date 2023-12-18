import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int at = sc.nextInt();
		sc.nextLine();
		String line = sc.nextLine();
		sc.close();
		line = "T" + line + "T";
		// closeしよう
		String pre = line.substring(0, at);
		String suf = line.substring(at+1, size+1);
		char atChar = line.charAt(at);
		Character.toLowerCase(atChar);
		String output = pre + Character.toLowerCase(atChar) + suf;

		System.out.println(output.substring(1,size+1));
	}
}