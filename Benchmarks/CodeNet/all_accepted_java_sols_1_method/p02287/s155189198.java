import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] heapArrays = new int[size + 1];
		for (int i = 1; i < size + 1; i++) {
			heapArrays[i] = scanner.nextInt();
		}
		for (int i = 1; i < size + 1; i++) {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("node ").append(i).append(": ")
						 .append("key = ").append(heapArrays[i]).append(", ");
			if (i / 2 > 0) {
				stringBuilder.append("parent key = ").append(heapArrays[i / 2]).append(", ");
			}
			if (i * 2 < size + 1) {
				stringBuilder.append("left key = ").append(heapArrays[i * 2]).append(", ");
			}
			if (i * 2 + 1 < size +1) {
				stringBuilder.append("right key = ").append(heapArrays[i * 2 + 1]).append(", ");
			}
			System.out.println(stringBuilder.toString());
		}
	}
}