import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int start = 0;
		for (int i = 1; i <= n; i++) {
			int count = 0;
			for (int j = 1;; j++) {
				if (Math.pow(3 * j, 2) > i) {
					start = Math.max(j - 1, 1);
					break;
				}
			}
			int Y = start;
			int Z = start;
			for (int x = start;; x++) {
				if (cal(x, Y, Z) > i) {
					break;
				}
				for (int y = start;; y++) {
					if (cal(x, y, Z) > i) {
						break;
					}
					for (int z = start;; z++) {
						if (cal(x, y, z) > i) {
							break;
						} else if (cal(x, y, z) == i) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}

	public static int cal(int x, int y, int z) {
		return (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) + x * y + y * z + z * x);
	}

}
