import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String a = sc.nextLine();
		List<Integer> aList = new ArrayList<Integer>();
		Arrays.stream(a.split(" ")).forEach(e -> aList.add(Integer.valueOf(e)));
		Collections.sort(aList);

		System.out.println(aList.get(n - 1) - aList.get(0));

		sc.close();
	}
}