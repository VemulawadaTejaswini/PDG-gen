import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//		Scanner sc = new Scanner(System.in);
		//		String s = sc.nextLine();
		//
		//		char[] array = s.toCharArray();
		//
		//		for (int i = 0; i < s.length(); i++) {
		//			if (array[i] == 'B') {
		//				if (array[i + 1] == 'W') {
		//					char temp = array[i + 1];
		//					array[i + 1] = array[i];
		//					array[i] = temp;
		//
		//				} else {
		//					int firstB = i;
		//					findW(array, i, firstB);
		//				}
		//
		//			}
		//		}

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		char[] array = s.toCharArray();

		long countB = 0;
		long ans = 0;

		for (char c : array) {

			if (c == 'B') {
				countB++;
			} else {
				ans += countB;
			}

		}

		System.out.println(ans);

	}
	//
	//	private static void findW(char[] array, int i, int firstB) {
	//		// TODO 自動生成されたメソッド・スタブ
	//		if (array[i] == 'B') {
	//			if (array[i + 1] == 'W') {
	//				char temp = array[i + 1];
	//				array[i + 1] = array[i];
	//				array[i] = temp;
	//				count++;
	//
	//			} else {
	//				findW(array, i, firstB);
	//			}
	//
	//		}
	//	}

}
