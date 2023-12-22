import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		List<Integer> intArray = new ArrayList<>();

		for(int i=0 ; i<num ; i++) {
			intArray.add(sc.nextInt());
		}

		HashSet<Integer> type = new HashSet<>(intArray);

		System.out.print(type.size() < intArray.size() ? "NO" : "YES");
	}
}