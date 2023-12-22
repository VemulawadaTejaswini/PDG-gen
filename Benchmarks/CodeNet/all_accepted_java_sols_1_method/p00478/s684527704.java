import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String find;
		String ring;
		int n;
		int count;
		boolean flag = true;
		
		find = sc.next();
		n = sc.nextInt();
		count = 0;
		for (int i = 0; i < n; i++) {
			ring = sc.next();
			if (ring.contains(find)) {
				count++;
			} else {
				for (int j = ring.length() - find.length() + 1; j < ring.length(); j++) {
					flag = true;
					for (int k = 0; k < find.length(); k++) {
						if (ring.charAt((j + k) % ring.length()) != find.charAt(k)) {
							flag = false;
						}
					}
					if (flag) {
						count++;
						break;
					}
				}
			}
		}
		System.out.println(count);
	}
}