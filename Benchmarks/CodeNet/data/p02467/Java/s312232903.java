mport java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static int nowSosuu = 1;
	private static ArrayList<Integer> array = new ArrayList<Integer>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		System.out.printf(n + ":");

		if(checkSosuu(n)) {
			System.out.printf(" " + n);
		}
		else {
			while(n != 1) {
				setNextSosuu();
				while(n % nowSosuu == 0) {
					System.out.printf(" %d", nowSosuu);

					n /= nowSosuu;
				}
			}
		}
		System.out.println("");

		scan.close();
	}

	private static void setNextSosuu() {
		while(true) {
			nowSosuu++;
			if(checkNotMultiple(nowSosuu)) {
				array.add(nowSosuu);
				return;
			}
		}
	}

	private static boolean checkNotMultiple(int num) {
		for(int i = 0; i < array.size(); i++) {
			if(num % array.get(i) == 0) {
				return false;
			}
		}
		return true;
	}

	private static boolean checkSosuu(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
