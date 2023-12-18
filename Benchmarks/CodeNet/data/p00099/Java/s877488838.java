import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String[] nico = sc.nextLine().split(" ");
		int n = Integer.parseInt(nico[0]);
		int q = Integer.parseInt(nico[1]);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < q; i++) {
			String[] set = sc.nextLine().split(" ");
			int[] data = new int[set.length];
			
			for (int j = 0; j < set.length; j++) {
				data[j] = Integer.parseInt(set[j]);
			}
			
			if (hm.containsKey(data[0])) hm.put(data[0], (hm.get(data[0]) + data[1]));
			else hm.put(data[0], data[1]);

			int max = 0;
			int no = -1;
			for (int key : hm.keySet()) {
				int tmp = hm.get(key);
				if (max <= tmp) {
					if (max == tmp) {
						if ((no == -1) || (no > key)) no = key;
					} else {
						max = tmp;
						no = key;
					}
				}
			}
			System.out.println(no + " " + max);
		}
	}
}