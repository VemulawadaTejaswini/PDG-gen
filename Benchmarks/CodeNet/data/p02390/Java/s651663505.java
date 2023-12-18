import java.util.Scanner;

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String input_str = scanner.next();
		int input = Integer.parseInt(input_str);

		int hour = 3600;
		int minute = 60;

		if(input >= 0 && input <= 86400) {
			int output_h = input / hour;
			int output_m = (input % hour) / minute;
			int output_s = input % minute;

			System.out.println(output_h + ":" + output_m + ":" + output_s);
		}

    	scanner.close();
    }
}

