import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			long nextInt = sc.nextLong();
			stringList.add(nextInt);
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Long> list = getStrings(sc, n);
		long sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum = sum ^ list.get(i);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(sum ^ list.get(i));
		}
	}

}
