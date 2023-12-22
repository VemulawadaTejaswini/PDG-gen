import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		sc.nextLine();
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			//System.out.println(i);
			array[i] = sc.nextLine();
			//System.out.println(array[i]);
			if (i == 0) {
				continue;
			}

			//デバッグ用メソッド
			//System.out.println(i);

			//System.out.println(array[i].substring(0, 1));
			//System.out.println(array[i - 1].length() - 1);

			if (!(array[i].substring(0, 1)).equals(array[i - 1].substring(array[i - 1].length() - 1))) {
				System.out.println("No");
				return;
			}
		}
		//uniqueチェック
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				if (array[i].equals(array[j])) {
					System.out.println("No");
					return;
				}
			}
		}
		System.out.println("Yes");
	}

}