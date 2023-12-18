class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] alpha = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0, 0, 0, 0, 0, 0, 0, 0 };
		char[] bet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		int kaisuu;
		while (sc.hasNext()) {
			String s = sc.next();
			for (kaisuu = 0; kaisuu < s.length(); kaisuu++) {
				char moji = s.charAt(kaisuu);
				if (moji >= 'A' & moji <= 'Z') {
					alpha[moji - 'A'] += 1;
				} else if (moji >= 'a' & moji <= 'z') {
					alpha[moji - 'a'] += 1;
				}
			}
		}
		for (kaisuu = 0; kaisuu < 26; kaisuu++) {
			System.out.println(bet[kaisuu] + " : " + alpha[kaisuu]);
		}
	}
}