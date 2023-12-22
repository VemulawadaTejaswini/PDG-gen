import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		List<String> list = Arrays.asList(str.split(""));
		int size = list.size();
		int i = size / 2;
		int count = 0;
		for (int j = 0; j < i; j++) {
			if (!list.get(j).equals(list.get(size - 1 - j))) {
				count++;
			}
		}
		System.out.println(count);
	}
}