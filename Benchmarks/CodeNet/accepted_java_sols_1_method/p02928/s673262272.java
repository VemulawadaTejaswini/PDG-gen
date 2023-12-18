import java.math.BigInteger;
import java.util.*;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] lines = scanner.nextLine().split(" ");
		int N = Integer.parseInt(lines[0]);
		long K = Long.parseLong(lines[1]);

		String[] arrays = scanner.nextLine().split(" ");
		int[] newArray = Stream.of(arrays).mapToInt(Integer::parseInt).toArray();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < newArray.length; i++)
			array.add(newArray[i]);

		long P = 0;
		for (int i = 0; i < array.size() - 1; i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) > array.get(j) && i < j)
					P++;
			}
		}

		long Q = 0;
		for (int i = 0; i < array.size(); i++) {
			for (int j = 0; j < array.size(); j++) {
				if (array.get(i) > array.get(j))
					Q++;
			}
		}

		BigInteger b_k = new BigInteger(String.valueOf(K));
		BigInteger b_k_1 = new BigInteger(String.valueOf(K - 1));

		BigInteger b = b_k.multiply(b_k_1).multiply(BigInteger.valueOf(Q)).divide(BigInteger.valueOf(2))
				.add(BigInteger.valueOf(P).multiply(BigInteger.valueOf(K)));
		BigInteger res = b.mod(BigInteger.valueOf(1000000007));

		System.out.println(res);

	}

}
