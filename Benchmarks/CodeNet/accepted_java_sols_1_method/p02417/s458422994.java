public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int[] arr = new int[26];
			String sentence = null;

			while (sc.hasNext()) {
				sentence = sc.nextLine();
				for (char c : sentence.toCharArray()) {
					int num = Character.toLowerCase(c) - 'a';  // 文字 ch の番号
					if (0 <= num  && num < 26) {
						arr[num]++;
					}
				}
			}
			java.util.stream.IntStream.range(0, arr.length)
				.forEachOrdered(i ->System.out.println((char) ('a' + i) + " : " + arr[i]));
		}
	}
}
