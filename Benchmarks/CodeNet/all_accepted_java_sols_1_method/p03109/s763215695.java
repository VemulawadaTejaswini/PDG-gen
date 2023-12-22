import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] tokens = in.nextLine().split("/");
		in.close();
		int year = Integer.parseInt(tokens[0]);
		int month = Integer.parseInt(tokens[1]);
		int day = Integer.parseInt(tokens[2]);
		boolean isHeisei = false;
		if (year <= 2018) {
			isHeisei = true;
		} else if (month <= 4) {
			isHeisei = true;
		}
		String result = isHeisei ? "Heisei" : "TBD";
		System.out.println(result);
	}

}