import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int setNum = in.nextInt();
		for (int i = 0; i < setNum; i++) {
			int blockNum = in.nextInt();
			int max = 0;
			int min = 0;
			int pre = in.nextInt();
			for (int n = 1; n < blockNum; n++) {
				int now = in.nextInt();
				int d = now - pre;
				max = Math.max(max, d);
				min = Math.max(min, -d);
				pre = now;
			}
			System.out.print(max);
			System.out.print(" ");
			System.out.println(min);
		}
	}

}