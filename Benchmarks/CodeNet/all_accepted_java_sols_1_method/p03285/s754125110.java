public class Main {
	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		
		for (int i = 0; i <= n / 4; i++) {
			// 4ドルのケーキの金額 (4ドル x i個)
			int a = i * 4;
			for (int j = 0; j <= n / 7; j++) {
				// 7ドルのケーキの金額(7ドル x j個)
				int b = j * 7;
				if (a + b == n) {
					System.out.println("Yes");
					return;
				}
			}
		}
		System.out.println("No");
	}
}