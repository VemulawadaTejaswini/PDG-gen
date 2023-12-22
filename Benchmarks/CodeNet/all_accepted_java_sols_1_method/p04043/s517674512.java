import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();

		list.add(scanner.nextInt());
		list.add(scanner.nextInt());
		list.add(scanner.nextInt());

		if(list.contains(5)) {
			list.remove(list.indexOf(5));
		}
		if(list.contains(7)) {
			list.remove(list.indexOf(7));
		}
		if(list.contains(5)) {
			list.remove(list.indexOf(5));
		}
		if(list.size()==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	    scanner.close();
		}
}
