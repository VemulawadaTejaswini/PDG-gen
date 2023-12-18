import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int q = sc.nextInt();
			Map<String, Integer> m = new HashMap<>();
			for(int i = 0; i < q; i++) {
				int query = sc.nextInt();
				switch(query) {
				case 0:
					m.put(sc.next(), sc.nextInt());
					break;
				case 1:
					System.out.println(m.getOrDefault(sc.next(), 0));
					break;
				case 2:
					m.remove(sc.next());
					break;
				}
			}
		}
	}
}
