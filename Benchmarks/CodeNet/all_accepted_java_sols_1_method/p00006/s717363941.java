import java.util.Scanner;

class Main{
	public static void main(String[] a){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
        scanner.close();
		if (input.length() > 20) return;
		String reverse="";
		
		char[] c = input.toCharArray();
		for (int i = c.length; i > 0; i--) {
			reverse += c[i-1];
		}
		System.out.println(reverse);
	}
}