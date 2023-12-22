import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int personNum = Integer.parseInt(sc.nextLine());
		List<String> elements = Arrays.asList(sc.nextLine().split(""));
		
		long red_count = elements.stream().filter( s -> s.equals("R") ).count();
		int harfNum = personNum%2 == 0 ? personNum/2 + 1 : (personNum+1)/2;
		String result = harfNum <= red_count ? "Yes" : "No";
		System.out.println(result);
		sc.close();
	}
}
