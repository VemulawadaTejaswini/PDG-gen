package mw.aoj.src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static List<Integer> list = new ArrayList<Integer>();
	public static void main(String[] a) throws IOException {
		for (int i = 0; i < 200; ++i) {
			Integer num1 = 0, num2 = 0;
			String str = sc.nextLine();
			if (str.equals("")) {
				break;
			}
			try {
				num1 = Integer.parseInt(str.split("\\s")[0]);
				num2 = Integer.parseInt(str.split("\\s")[1]);
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.exit(1);
			} catch (ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
				System.exit(1);
			}
			if (num1 < 0 || 10000 < num1 || num2 < 0 || 10000 < num2) {
				System.exit(1);
			}
			list.add(num1 + num2);
		}
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(String.valueOf(list.get(i)).length());
		}
	}
}