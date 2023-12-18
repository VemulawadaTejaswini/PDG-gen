import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			StringBuffer str =  new StringBuffer(scanner.next());
			System.out.println(str.reverse());
		}
	}
}