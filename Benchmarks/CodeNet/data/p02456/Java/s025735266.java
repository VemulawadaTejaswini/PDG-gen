import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			int times = sc.nextInt();
			Set<Long> set = new HashSet<Long>();
			for (int i = 0; i<times; i++){
				int query = sc.nextInt();
				long x = sc.nextLong();
				switch (query) {
				case 0:
					set.add(x);
					System.out.println(set.size());
					break;
				case 1:
					if (set.contains(x)) {
						System.out.println(1);
					} else System.out.println(0);
					break;
				case 2:
					set.remove(x);
					break;
				}
			}
		}
	}
}
