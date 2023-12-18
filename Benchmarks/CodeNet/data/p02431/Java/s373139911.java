import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Long> array = new ArrayList<Long>();
		Deque<String> outArray = new ArrayDeque<String>();
		int outCount = 0;
		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			switch (sc.nextByte()) {
				case 0:
					array.add(sc.nextLong());
					break;
				case 1:
					outArray.addLast((array.get(sc.nextInt())).toString());
					break;
				case 2:
					array.remove(array.size() - 1);
					break;
			}
		}
		for (String out:outArray) {
			System.out.println(out);
		}
	}
}

