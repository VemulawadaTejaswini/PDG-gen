import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while (sc.hasNext()) {
				String s = sc.nextLine();
				s = s.replaceAll("apple", "XXXXX");
				s = s.replaceAll("peach", "apple");
				s = s.replaceAll("XXXXX", "peach");
				System.out.println(s);
			}
		}
	}
}