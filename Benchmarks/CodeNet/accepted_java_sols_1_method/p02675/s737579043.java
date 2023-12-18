import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = Integer.parseInt(in.next());
		List<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(6);
		list.add(8);

		int ph = N%10;
		if(ph == 3) {
			System.out.println("bon");
		}else if(list.contains(ph)) {
			System.out.println("pon");
		}else {
			System.out.println("hon");
		}
	}
}
