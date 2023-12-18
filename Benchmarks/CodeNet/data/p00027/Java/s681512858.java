import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] w = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday"};
		while(sc.hasNext()) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			int k;
			if(m == 1 || m == 2) {
				m = 12 + m;
				k = -1;
			}else {
				k = 0;
			}
			if(m == 0)break;
			System.out.println(w[zeller(2004 + k, m, d)]);
		}
		sc.close();
	}
	static int zeller(int y, int m, int d) {
		int Y = y % 100;
		int C = y / 100;
		int t1 = d;
		int t2 = (26 * (m + 1)) / 10;
		int t3 = Y + Y / 4;
		int t4 = 5 * C + C / 4;
		return (t1 + t2 + t3 + t4) % 7;
	}
}
