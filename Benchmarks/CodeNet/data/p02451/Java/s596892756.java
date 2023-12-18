import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		Scanner s= new Scanner(System.in);

		int listLen = Integer.parseInt(s.nextLine());
		Thread.sleep(1);
		//String[] listOfStrings = s.nextLine().split(" ");

		HashMap<Integer, Boolean> map = new HashMap<>(listLen * 2);
		//Arrays.stream(s.nextLine().split(" ")).mapToInt(Integer::parseInt).forEach(i -> map.put(i, true));
		//for (String listOfString : listOfStrings) map.put(Integer.parseInt(listOfString), true);
		for (int i = 0; i < listLen; ++i) {
//			System.out.println(s.nextInt());
			map.put(Integer.parseInt(s.next()), true);
		}

		StringBuilder sb = new StringBuilder(listLen * 2);
		int numQueries = s.nextInt();
		for (int i = 0; i < numQueries; ++i) {
			int x = s.nextInt();
			sb.append(map.get(x) != null ? "1\n" : "0\n");
		}
		System.out.print(sb.toString());
	}
}

