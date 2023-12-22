import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 172_B
		Scanner sc = new Scanner(System.in);
		int iRes = 0;

		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String[] strArray1 = str1.split("");
		String[] strArray2 = str2.split("");

		for(int i = 0; i < str1.length(); i++) {
			if (!strArray1[i].equals(strArray2[i])) {
				iRes++;
			}
		}
		System.out.println(iRes);
	}

}
