public class ListOfTop3Hills {
	public static void main(String[] args) {
		int[] mountains = new int[10];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < mountains.length; i++) {
			int value = scanner.nextInt();
			mountains[i] = value;
		}
		int[] top3 = top3(mountains);
		for (int i = 0; i < 3; i++) {
			System.out.println(top3[i]);
		}
	}
	public static int[] top3(int[] mountains) {
		int[] top3 = new int[3];
		Arrays.sort(mountains);
		int j = 0;
		for (int i = mountains.length - 1; j < 3; i--) {
			top3[j] = mountains[i];
			j++;
		}
		return top3;
	}
}