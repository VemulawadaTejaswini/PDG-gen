import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		while(sc.hasNext()) {
			String[] data = sc.nextLine().split(",");
			bmiCheck(data);
		}
	}

	private static void bmiCheck(String[] data) {
		int student_id = Integer.parseInt(data[0]);
		double w = Double.parseDouble(data[1]);
		double h = Double.parseDouble(data[2]);
		double bmi = w / h / h;

			if (bmi >= 25) {
				System.out.println(student_id);
			}
	}

}
