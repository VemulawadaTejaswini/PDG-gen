import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Double> list = new ArrayList<Double>();
		while (in.hasNext())
			list.add(in.nextDouble());
		Double[] arr = list.toArray(new Double[list.size()]);
		Arrays.sort(arr);
		System.out.println(arr[arr.length - 1] - arr[0]);
	}
}