import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int count = 0;

		for (int i = A; i <= B; i++) {
			String temp = String.valueOf(i);
			char[] tempList = temp.toCharArray();
			int length = temp.length();
			int halfLength = length / 2;
			boolean isAllSameNumber = true;
			if (length % 2 == 0) {

				for (int j = 0 ; j < halfLength+1; j++) {
					if (tempList[j] != tempList[length-1-j]) {
						isAllSameNumber = false;
						break;
					}
				}
			} else {
				for (int j = 0; j < halfLength ; j++) {
					if (tempList[j] != tempList[length-1-j]) {
						isAllSameNumber = false;
						break;
					}
				}

			}
			if (isAllSameNumber) {
				count = count + 1;
			}

		}
		System.out.println(count);
	}
}
