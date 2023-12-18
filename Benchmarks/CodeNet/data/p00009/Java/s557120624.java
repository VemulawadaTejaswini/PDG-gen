class Main {
	public static void main(String[] args) {
		int N_MAX = 999999 + 1;
		Boolean[] cands = new Boolean[N_MAX];
		int[] NumOfPrime = new int[N_MAX];
		int count = 0;
		Arrays.fill(cands, true);
		cands[0] = cands[1] = false;
		for (int i = 2; i < N_MAX; i++) {
			if (cands[i] == true) {
				count++;
				for (int j = i; j < N_MAX; j += i) {
					cands[j] = false;
				}
			}
			NumOfPrime[i] = count;
		}
		Scanner in = new Scanner(System.in);
		int n;
		while (in.hasNext()) {
			n = in.nextInt();
			System.out.println(NumOfPrime[n]);
		}
		in.close();
	}
}