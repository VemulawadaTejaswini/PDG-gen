import java.util.Scanner;

class Main {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		String[] str = s.split("");
		int total = 700;
		
		for (byte i = 0; i < s.length(); i++) {
			if (str [i].equals("o")) {
				total += 100;
			}
		}
		
		System.out.println(total);
	}
}