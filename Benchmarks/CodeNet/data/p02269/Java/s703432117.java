import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Long> set = new HashSet<Long>();
		
		for (int i = 0; i < n; i++) {
			String order = sc.next();
			String name = sc.next();
			long enc = 0;
			
			for (int j = 0; j < name.length(); j++) {
				switch (name.charAt(j)) {
					case 'A':
						enc = enc * 10 + 1;
						break;
					case 'C':
						enc = enc * 10 + 2;
						break;
					case 'G':
						enc = enc * 10 + 3;
						break;
					case 'T':
						enc = enc * 10 + 4;
						break;
				}
			}
			
			if (order.equals("insert")) {
				set.add(enc);
			} else {
				if (set.contains(enc)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
	}
}