import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int total0 = 0;
		int totalN = 0;
		for (int i = 0; i < m; i++) {
			int z = sc.nextInt();
			if (z < x) {
				total0++;
			} else {
				totalN++;
			}
		}
		if (total0 < totalN) {
			System.out.println(total0);
		} else {
			System.out.println(totalN);
		}
	}
}
