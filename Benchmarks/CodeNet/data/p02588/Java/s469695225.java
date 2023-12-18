import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < arr.length; i++) {
			double d = sc.nextDouble();
			String s1 = String.valueOf(d);
			if (s1.contains("\\d+(\\.\\0{1,9})?")) continue;
			arr[i] = d;
		}
		System.out.println(solve(arr, n));
	}

	private static long solve(double[] arr, int n) {
		// TODO Auto-generated method stub
		Map<String, Double> map = new HashMap<String, Double>();
		long res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				double num = arr[i] * arr[j];
				if (num % 1 == 0) {
					System.out.println(arr[i] + "*" + arr[j] + " = " + num);
					String key = arr[i] + "*" + arr[j];
					map.put(key, num);
					res++;
				}	
			}
		}
		return res;
	}

}
