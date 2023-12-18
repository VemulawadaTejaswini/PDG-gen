import java.util.*;
public class MtHillsTopThree {
	public static void main (String[] args) {
		int[] hills = new int[3];
		hills[0] = 0;
		hills[1] = 0;
		hills[2] = 0;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			int hill = scan.nextInt();
			if (hills[2] < hill) {
				if (hills[1] < hill) {
					if (hills[0] < hill) {
						hills[2] = hills[1];
						hills[1] = hills[0];
						hills[0] = hill;
					} else {
						hills[2] = hills[1];
						hills[1] = hill;
					}
				} else {
					hills[2] = hill;
				}
			}
		}
		for (int topThree : hills) {
			System.out.println(topThree);
		}
	}
}