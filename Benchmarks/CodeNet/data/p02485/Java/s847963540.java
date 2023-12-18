import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while (true) {
			String s = sc.nextLine();
			if (s == "0")
				break;
			for (int i = 0; i < s.length(); i++) {
				char keta = s.charAt(i);
				sum += Integer.parseInt("" + keta);
			}
			System.out.println(sum);
			sum = 0;
		}
	}
}