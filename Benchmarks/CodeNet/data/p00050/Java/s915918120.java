import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String text = sc.nextLine();

		String ansText = text.replace("apple", "Peach").replace("peach", "apple");
		ansText = ansText.replace("Peach", "peach");

		System.out.println(ansText);
	}

}