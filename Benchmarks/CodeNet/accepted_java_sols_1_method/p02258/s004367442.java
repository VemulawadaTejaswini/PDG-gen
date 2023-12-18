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
		long min = values.get(0);
		for (int i = 1; i < values.size(); i++) {
			long diff = values.get(i) - min;
			if (biggest < diff) {
				biggest = diff;
			}
			if (values.get(i) < min) {
				min = values.get(i);
			}
		}

		System.out.println(biggest);
	}
}