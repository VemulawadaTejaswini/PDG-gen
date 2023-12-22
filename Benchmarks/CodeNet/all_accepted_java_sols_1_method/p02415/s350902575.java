
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String data = scn.nextLine();
		char[] datas = data.toCharArray();
		for (int i = 0; i < data.length(); i++) {
			if (Character.isLowerCase(datas[i])) {
				datas[i] = Character.toUpperCase(datas[i]);
			} else if (Character.isUpperCase(datas[i])) {
				datas[i] = Character.toLowerCase(datas[i]);
			}
		}
		String changedData = String.valueOf(datas);
		System.out.println(changedData);
	}
}

