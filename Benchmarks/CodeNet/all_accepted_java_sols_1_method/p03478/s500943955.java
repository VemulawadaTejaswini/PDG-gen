import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sum = 0;

		for (int i = 0; i <= N; i++) {
			String x = Integer.toString(i);
			char[] data = x.toCharArray();
			int y = 0;
			for (int k = 0; k < data.length; k++) {
//				System.out.println(data[k]); //デバッグ
				y += Character.getNumericValue(data[k]);
			}
//			System.out.println(y); //デバッグ
			if ((y >= A) && (y <= B)) {
				sum += i;
			}
		}
		System.out.println(sum);

		sc.close();
	}

}
