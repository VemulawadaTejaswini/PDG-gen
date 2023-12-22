import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		int nm1 = sc.nextInt();
		String[] strArr = sc.next().split("");

		int count = 0;
		for (int i = 0; i < strArr.length - 2; i++) {
			if ("A".equals(strArr[i]) && "B".equals(strArr[i + 1]) && "C".equals(strArr[i + 2])) {
				count++;
			}
		}

		System.out.println(count);

	}
}