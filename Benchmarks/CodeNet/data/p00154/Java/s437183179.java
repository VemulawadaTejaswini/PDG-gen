public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			Map<Integer, Integer> memo = new HashMap<Integer, Integer>();
			memo.put(0, 1);
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				Map<Integer, Integer> tmp = new HashMap<Integer, Integer>();
				tmp.putAll(memo);
				for (Entry<Integer, Integer> entry : memo.entrySet()) {
					for (int j = 1; j <= b; j++) {
						int c = entry.getKey() + a * j;
						if (c > 1000) {
							continue;
						}
						int d = entry.getValue();
						if (tmp.containsKey(c)) {
							tmp.put(c, d + tmp.get(c));
						} else {
							tmp.put(c, d);
						}

					}
				}
				memo = tmp;

			}
			int s = scanner.nextInt();
			while (s-- > 0) {
				int m = scanner.nextInt();
				if (!memo.containsKey(m)) {
					System.out.println(0);
				} else {
					System.out.println(memo.get(m));
				}
			}
		}
	}
}