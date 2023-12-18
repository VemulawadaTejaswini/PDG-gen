import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> highList = new ArrayList<>();
		while(sc.hasNextInt()) {
			highList.add(sc.nextInt());			
		}
		highList.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
	}
}