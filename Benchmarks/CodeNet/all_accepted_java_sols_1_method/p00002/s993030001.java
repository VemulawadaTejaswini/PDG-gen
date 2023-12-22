import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			sc = new Scanner(System.in);
			while (sc.hasNext()) {
				int[] numList = new int[2];
				for (int i = 0; i < 2; i++) {
					numList[i] = sc.nextInt();
				}
				int numRank = ("" + (numList[0] + numList[1])).length();
				System.out.println(numRank);
			}

		}catch (Exception e) {
			System.out.println(e);
		} finally {
			if (sc != null) {
				try {
					sc.close();
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}