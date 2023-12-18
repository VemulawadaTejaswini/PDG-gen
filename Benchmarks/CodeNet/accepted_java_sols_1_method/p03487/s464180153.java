import java.util.HashMap;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			if (map.containsKey(a[i]) == true) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		int count = 0;
		for (int key : map.keySet()) {
			if (key > map.get(key)) {
				count += map.get(key);
			} else if (key < map.get(key)) {
				count += (map.get(key) - key);
			}
		}
		System.out.println(count);
	}
}