
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int count = scn.nextInt();
		int taroScore = 0;
		int hanakoScore = 0;
		for (int i = 0; i < count; i++) {
			String taroData = scn.next();
			String hanakoData = scn.next();
			int result = taroData.compareTo(hanakoData);
			if (result > 0) {
				taroScore = taroScore + 3;
			} else if (result < 0) {
				hanakoScore = hanakoScore + 3;
			} else if (result == 0) {
				taroScore = taroScore + 1;
				hanakoScore = hanakoScore + 1;
			}
		}
		System.out.println(taroScore + " " + hanakoScore);
	}
}

