import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		if(Integer.parseInt(string)%1000 == 0) {
			System.out.println(0);
		}else if(1000>=Integer.parseInt(string)) {
			System.out.println(1000 - Integer.parseInt(string));
		}else {
			System.out.println(1000 - Integer.parseInt(string.substring(string.length()-3)));
		}
		scanner.close();
	}
}