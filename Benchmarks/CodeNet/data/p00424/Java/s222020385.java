import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
	static Scanner sc = new Scanner(System.in);
	static Map<String, String> map = new HashMap<>();

	public static void main(String[] args) {
		int n;
		while((n = sc.nextInt()) != 0) {
			run(n);
		}
	}

	static void run(int n) {
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String line = sc.nextLine();
			String[] t = line.split(" ");
			map.put(t[0], t[1]);
		}

		n = sc.nextInt();
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			if(map.containsKey(str)) {
				System.out.print(map.get(str));
			} else {
				System.out.print(str);
			}
		}
	}

}