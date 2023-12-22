import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		HashMap<String, Boolean> hm = new HashMap<>();
		for(int i = 0; i < n; i++) {
			String tmp = sc.next();
			if(hm.containsKey(tmp)) {
				hm.remove(tmp);
			}else {
				hm.put(tmp, Boolean.TRUE);
			}
		}
		System.out.println(hm.size());
	}
}
