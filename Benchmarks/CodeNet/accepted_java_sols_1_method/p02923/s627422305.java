
import java.util.Scanner;

public class Main {
	static int intN =0;
	static int sosuCnt =0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.nextLine();
		String[] h = sc.nextLine().split(" ");

		int intN = Integer.parseInt(n);

		int max = 0;
		int cnt=0;
		for (int i = 0;i < h.length-1;i++) {
			if (Integer.parseInt(h[i]) >= Integer.parseInt(h[i+1])) {
				cnt++;
			} else {
				if (max < cnt) {
					max=cnt;
				}
				cnt=0;
			}
		}
		if (max < cnt) {
			max=cnt;
		}


		System.out.println(max);
	}
}