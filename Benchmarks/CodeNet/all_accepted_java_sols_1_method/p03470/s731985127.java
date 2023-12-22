import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		List<Integer> mochi = new ArrayList<Integer>();
		while (sc.hasNextLine()) {
			mochi.add(Integer.valueOf(sc.nextLine()));
		}
		Long result=mochi.stream().distinct().count();
		System.out.println(result);
	}
}