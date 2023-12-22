
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i = 0 ; i < n ; i++) {
			int a = sc.nextInt();
			if(!map.containsKey(-a)) map.put(-a, 1);
			else map.put(-a, map.get(-a) + 1);
		}
		int x = -1;
		for(int key : map.keySet()) {
			if(x == -1 && map.get(key) >= 4) {
				System.out.println(1L * key * key);
				return;
			} else if(x != -1 && map.get(key) >= 2) {
				System.out.println(1L * x * key);
				return;
			} else if(map.get(key) >= 2) {
				x = key;
			}
		}
		System.out.println(0);
	}
}