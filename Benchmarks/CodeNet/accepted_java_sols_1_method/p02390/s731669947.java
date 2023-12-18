import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String line = null;
		try (Scanner sc = new Scanner(System.in)) {
			line = sc.nextLine();
			int inputNum = Integer.parseInt(line);
			
			int hour = inputNum / 3600;
			int minutes = (inputNum % 3600) / 60;
			int second = (inputNum % 3600) % 60;
			System.out.println(hour + ":" + minutes + ":" +second);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

