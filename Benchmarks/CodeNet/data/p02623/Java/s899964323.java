
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int conbo = n + m;
		long max = scan.nextInt();
		long[] books = new long[n + m];
		long ans = 0;
		for (int i = 0; i < n + m; i++) {
			books[i] = scan.nextInt();
		}

		//全探索が必要な要素要素（conbo）の２条分のループ(on-off全探索)
		for (int bit = 0; bit < 1 << conbo; bit++) {

			long sum = 0;
			int count = 0;

			//要素分のループ
			for (int i = 0; i < books.length; i++) {

				//その要素が今回onになっているかチェック
				if ((1 & bit >> i) == 1) {

					sum = sum + books[i];
					count++;
				}
			}

			if (sum <= max) {
				if (ans < count) {
					ans = count;
				}
			}

		}

		System.out.println(ans);

	}
