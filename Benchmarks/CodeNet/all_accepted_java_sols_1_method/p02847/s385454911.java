import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {


			String[] days = new String[]{"SUN", "MON" , "TUE", "WED", "THU", "FRI", "SAT"};
			
			String s = sc.next();
			
			List<String> daysList = Arrays.asList(days);
			
			int index = daysList.lastIndexOf(s);
			
			System.out.println(7-index);
		}
	}
}