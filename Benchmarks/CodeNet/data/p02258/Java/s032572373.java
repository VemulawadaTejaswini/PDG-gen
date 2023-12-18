import java.io.IOException;
import java.util.*;

public class Main {


	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int sizeOfList = sc.nextInt();
		List<Long> values = new ArrayList<Long>();

		long biggest = -(2000000000-1);
		for (int i = 0; i < sizeOfList; i++) {
			values.add(sc.nextLong());
		}

		for (int i = 0; i < values.size(); i++) {
			for (int j = i + 1; j < values.size(); j++) {
				long diff = values.get(j) - values.get(i);
				if (biggest < diff) {
					biggest = diff;
				}
			}
		}

		System.out.println(biggest);
	}
}