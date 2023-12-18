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
		int k = sc.nextInt();
		List<Long> array = getStrings(sc, n);
		array.sort(Long::compareTo);
		long sum = 0;
		for (int i = 0; i < k; i++) {
			sum+=array.get(i);
		}
		System.out.println(sum);
	}

}
