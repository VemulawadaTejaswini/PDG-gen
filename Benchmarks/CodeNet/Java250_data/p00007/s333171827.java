import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int i;
			int cnt = sc.nextInt();
			double ret = 100;
			for (i = 0; i < cnt; i++) {
				ret = ret + ret * 0.05;
				ret = Math.ceil(ret);
			}
			System.out.println((int) ret * 1000);
		}
	}
}