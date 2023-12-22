import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			int sum = (scan.nextInt() + scan.nextInt());
			System.out.println(String.valueOf(sum).length());
		}
	}
}