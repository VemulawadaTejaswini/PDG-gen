	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int x;

		for (int i = 1; i <= 10000; i++) {
			x = sc.nextInt();
			if (x == 0) {
				break;
			}
			System.out.println("Case " + i + ": " + x);

		}

	}

}
