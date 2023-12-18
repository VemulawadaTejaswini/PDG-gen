public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int cnt = sc.nextInt();
			int[][][] cntT = new int[4][3][10];
			java.util.stream.IntStream.range(0, cnt).forEachOrdered(i -> {
				int bIdx = sc.nextInt() - 1;
				int floor = sc.nextInt() - 1;
				int room = sc.nextInt() - 1;
				int v = sc.nextInt();

				int tmp = cntT[bIdx][floor][room] + v;
				if (tmp < 0) {
					cntT[bIdx][floor][room] = 0;
				} else if (tmp > 9) {
					cntT[bIdx][floor][room] = 9;
				} else {
					cntT[bIdx][floor][room] = tmp;
				}
			});

			for (int i = 0; i < cntT.length; i++) {
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < cntT[i].length; j++) {
					for (int k = 0; k < cntT[i][j].length; k++) {
						sb.append(" " + cntT[i][j][k]);
					}
					sb.append("\n");
				}
				if (i != cntT.length - 1) {
					sb.append("####################\n");
				}
				System.out.print(sb);
			}

		}
	}
}
