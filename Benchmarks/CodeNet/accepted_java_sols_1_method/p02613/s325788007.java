import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();
//		StringBuilder ans = new StringBuilder();
//		while (--t >= 0) {
		int n = sc.nextInt();
		String arr[] = { "AC", "WA", "TLE", "RE" };
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			map.put(s, ((map.containsKey(s)) ? map.get(s) : 0) + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " x " + ((map.containsKey(arr[i])) ? map.get(arr[i]) : 0));
		}
//		System.out.println(1000 * numOfNotes - n);
	}
}
//}
