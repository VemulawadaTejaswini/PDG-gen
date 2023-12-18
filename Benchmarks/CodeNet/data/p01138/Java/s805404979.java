import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = Integer.parseInt(sc.next());
			if (n == 0) break;
			int count = 0;
			int arrive = Integer.MAX_VALUE;
			int[] d = new int[n];
			Arrays.fill(d, Integer.MAX_VALUE);
			int departure;
			for (int i = 0; i < n; i++) {
				String[] t = sc.next().split(":");
				departure = Integer.parseInt(t[0]) * 3600 + Integer.parseInt(t[1]) * 60 + Integer.parseInt(t[2]);
				t = sc.next().split(":");
				int tem = Integer.parseInt(t[0]) * 3600 + Integer.parseInt(t[1]) * 60 + Integer.parseInt(t[2]);
				if (departure < arrive) {
					boolean exist = false;
					for (int j = 0; j < n; j++) {
						if (d[j] <= departure) {
							d[j] = Integer.MAX_VALUE;
							exist = true;
							break;
						}
					}
					for (int j = 0; j < n; j++)
						if (d[j] == Integer.MAX_VALUE) {
							d[j] = arrive;
							break;
						}
					if (!exist)
						count++;
				}
				arrive = tem;
			}
			System.out.println(count);
		}
	}
}
