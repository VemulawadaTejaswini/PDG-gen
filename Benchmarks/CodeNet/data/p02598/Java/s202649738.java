import java.util.*;

public class Main {
	private static long max = 0;
	private static List<Long> getStrings(Scanner sc, int num) {
		List<Long> stringList = new ArrayList<>();
		while(num>0) {
			Long nextInt = sc.nextLong();
			stringList.add(nextInt);
			if (nextInt > max) {
				max = nextInt;
			}
			num--;
		}
		return stringList;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		List<Long> array= getStrings(sc, n);
		long l = 1;
		long r = max;
		while (r>l) {
			long mid = (l+r)/2;
			long re = split(array, mid);
			if (re <= k) {
				r = mid;
			}  else {
				l = mid+1;
			}
		}
		System.out.println(r);
	}

	private static long split(List<Long> array, long standard) {
		long result = 0;
		for(Long t: array) {
			result += t/standard;
			if (t % standard != 0) {
				result++;
			}
			result--;
		}
		return result;
	}

}
