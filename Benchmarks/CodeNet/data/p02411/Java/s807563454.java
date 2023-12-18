import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Main {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();

		while (true) {
			int test01 = scanner.nextInt();
			int test02 = +scanner.nextInt();
			int totalTest = test01 + test02;
			int rTest = scanner.nextInt();
			if (totalTest + rTest == -3) {
				break;
			}
			if (totalTest < 30 ||test01 == -1 || test02 == -1) {
				System.out.println("F");
			} else {
				if (totalTest >= 80)
					System.out.println("A");
				if (totalTest < 80 && totalTest >= 65)
					System.out.println("B");
				if (totalTest < 65 && totalTest >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && rTest >= 50)
					System.out.println("C");
				if (totalTest >= 30 && totalTest < 50 && rTest <= 50)
					System.out.println("D");
			}
		}
	}
}