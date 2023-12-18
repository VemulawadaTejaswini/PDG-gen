import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);
		
		String line = sc.nextLine();
		
		while (line.equals("0") == false) {
			int num = Integer.parseInt(line);
			
			String[] nico = sc.nextLine().split(" ");
			
			int[] a = new int[num];
			for (int i = 0; i < num; i++) {
				a[i] = Integer.parseInt(nico[i]);
			}

			operation(a, 0);
			
			line = sc.nextLine();
		}
	}
	
	private void operation(int[] a, int n) {
		int[] b = new int[a.length];
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i]) + 1);
			} else {
				map.put(a[i], 1);
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = map.get(a[i]);
		}
		n++;
		
		boolean flag = true;
		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				flag = false;
				break;
			}
		}
		
		if (flag == true) {
			System.out.println(n);
			
			for (int i = 0; i < b.length; i++) {
				System.out.print(b[i]);
				if (i < (b.length - 1)) System.out.print(" ");
			}
			System.out.println();
		} else {
			operation(b, n);
		}
	}
}