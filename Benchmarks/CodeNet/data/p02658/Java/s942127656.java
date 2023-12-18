import java.math.BigInteger;
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
		List<Long> array = getStrings(sc, n);
		BigInteger result = BigInteger.ONE;
		BigInteger max = BigInteger.valueOf(1000000000000000000L);
		for(int i = 0;i<n;i++) {
			if (array.get(i) == 0L) {
				System.out.println(0);
				return;
			}
		}
		for(int i = 0;i<n;i++) {
			result = result.multiply(BigInteger.valueOf(array.get(i)));
			if (result.compareTo(max) > 0) {
				System.out.println(-1);
				return;
			}
		}
		System.out.println(result);
	}

}
