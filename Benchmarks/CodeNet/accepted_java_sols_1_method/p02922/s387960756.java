public class Main {
	public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();

		int cnt = 0;
		if (B == 1 || B == 0) {
			System.out.println("0");
			return;
		}

		if (A >= B) {
			System.out.println("1");
		} else {
			for (int i=0; i < B;i++) {
				if (A + (A-1) * i >= B) {
					System.out.println(i+1);
					break;
				}
			}
		}

	}
}