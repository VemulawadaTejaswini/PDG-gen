import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int n = 1; n <= N; n++) {
			int count = 0;

			for (int x = 1; x < n; x++) {
				if (x * x >= n) break;
				for (int y = x; y < n; y++) {
					if (x * x + y * y >= n) break;
					for (int z = y; z < n; z++) {
						if (x * x + y * y + z * z >= n) break;
						if (x * x + y * y + z * z + x * y + y * z + z * x == n) {
							if (x == y && y == z) {
								count +=1;
							} else if (x == y || y ==z){
								count +=3;
							} else {
								count +=6;
							}
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}
