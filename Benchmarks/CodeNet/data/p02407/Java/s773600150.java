public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
			int cnt = sc.nextInt();
			int[] arr = new int[cnt];
			java.util.stream.IntStream.range(0, cnt).forEachOrdered(i -> arr[i] = sc.nextInt());

			StringBuilder sb = new StringBuilder();
			for (int j = cnt -1; j >=0; j-- ) {
				sb.append(arr[j] + " ");
			}
			System.out.println(sb.toString().trim());
		}
	}
}
