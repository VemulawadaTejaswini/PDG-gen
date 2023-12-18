import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String text = new String();
		int num;
		int count = 1;
		while (true) {
			num = scan.nextInt();
			if (num == 0) {
				scan.close();
				System.out.println(text);
				break;
			} else {
				text += "Case " + count + ": " + num + "\n";
				count++;
			}
		}
	}

}