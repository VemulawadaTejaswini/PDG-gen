import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)  {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt() ;
		HashMap<Integer, Integer> hm = new HashMap<>();
		int tmp = 0;
		for(int i = 0; i < n; i++) {
			tmp = sc.nextInt();
			if(hm.containsKey(tmp)) {
				hm.put(tmp, hm.get(tmp) + 1);
			}else {
				hm.put(tmp, 1);
			}
		}
		sc.close();
		int count = 0;
		for(int i: hm.keySet()) {
			if(hm.get(i) > i) {
				count = count + (hm.get(i) - i);
			}else if(hm.get(i) < i) {
				count = count + hm.get(i);
			}
		}

		System.out.println(count);
	}
}