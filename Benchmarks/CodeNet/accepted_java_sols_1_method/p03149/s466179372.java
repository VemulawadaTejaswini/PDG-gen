import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] sp = str.split(" ");
		int[] year = { 1, 9, 4, 7 };

		boolean check1947 = true;
		for (int j = 0; j < year.length; j++) {
			boolean checkNo = false;
			for (int i = 0; i < sp.length; i++) {
				if (Integer.parseInt(sp[i]) == year[j])
					checkNo = true;
			}
			check1947 = check1947 && checkNo;
		}
		if (check1947)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
