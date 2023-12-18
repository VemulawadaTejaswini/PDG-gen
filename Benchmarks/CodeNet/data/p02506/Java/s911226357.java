import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String model;
		String words = "";
		int i = 0, j = 0,count = 0;
		model = sc.next();
		while (true) {
			words = sc.next();
			if (words == "END_OF_TEXT") break;
			if (words == model)count++;
		}
		System.out.println(count);
	}
}