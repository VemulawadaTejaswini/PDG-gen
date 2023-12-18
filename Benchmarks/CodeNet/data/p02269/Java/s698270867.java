import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static int m;
	static Map<Integer, String> map;
	public static boolean isPrime(int x) {
		if(x <= 1) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(x); i++) {
				if (x % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
	public static int hashfunc(int key, int i) {
		int hash = key % m;
		int j = 1;
		while(i > 0) {
			hash += key % (m - j);
			i--;
			j++;
		}
		return hash;
	}
	public static int transInt(String s) {
		switch (s) {
		case "A":
			return 1;
		case "C":
			return 2;
		case "G":
			return 3;
		case "T":
			return 4;
		default:
			return 0;
		}
	}

	public static int hashNumber(String s) {
		int sum = 0;
		String[] str = s.split("");
		for (int i = 0; i < str.length; i++) {
			sum += transInt(str[i]) * (i + 1);
		}
		return sum;
	}

	public static void insert(String word) {
		int key = hashNumber(word);
		int i = 0;
		while (map.containsKey(hashfunc(key, i))) {
			i++;
		}
		map.put(hashfunc(key, i), word);
	}

	public static boolean find(String word) {
		int key = hashNumber(word);
		int i = 0;
		while (map.containsKey(hashfunc(key, i))) {
			if (map.get(hashfunc(key, i)).equals(word)) {
				return true;
			} else {
				i++;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		m = n;
		while (!isPrime(m)) {
			m++;
		}
		map = new HashMap<>();
		String[] strings = new String[2];
		for (int i = 0; i < n; i++) {
			strings = sc.nextLine().split(" ");
			if (strings[0].equals("insert")) {
				insert(strings[1]);
			} else {
				if (find(strings[1])) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}
