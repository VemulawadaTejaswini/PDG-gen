import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] day = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		List<String> dayList = Arrays.asList(day);
		int index = dayList.indexOf(scanner.next());
		System.out.println(7 - index);
	}

}
