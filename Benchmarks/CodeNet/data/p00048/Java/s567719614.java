import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);


	public static void main(String[] args) {
		//?????°?¨????
		double num;
		String str;

		while(sc.hasNext()) {
			num = sc.nextDouble();

			if(num <= 48.00) {
				str = "light fly";
			} else if(num <= 51.00) {
				str = "fly";
			} else if(num <= 54.00) {
				str = "bantam";
			} else if(num <= 57.00) {
				str = "feather";
			} else if(num <= 60.00) {
				str = "light";
			} else if(num <= 64.00) {
				str = "light welter";
			} else if(num <= 69.00) {
				str = "welter";
			} else if(num <= 75.00) {
				str = "light middle";
			} else if(num <= 81.00) {
				str = "middle";
			} else if(num <= 91.00) {
				str = "light heavy";
			} else {
				str = "heavy";
			}

			System.out.println(str);
		}

	}

}