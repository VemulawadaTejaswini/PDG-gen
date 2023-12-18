import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Map<String,Boolean> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String Ni = sc.next();
			if (map.containsKey(Ni)) {
				map.remove(Ni);
			} else {
				map.put(Ni, Boolean.TRUE);
			}
		}
		
		System.out.println(map.size());
	}
}