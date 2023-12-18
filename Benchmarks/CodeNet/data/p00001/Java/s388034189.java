public class {
	public static void main(String[] args) {
		int[] array = { 1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592,
				922 };
		for (int i = 0; i < array.length; i += 1) {
			for (int j = i + 1; j < array.length; j += 1) {
				if (array[i] < array[j]) {
					int temporary = array[i];
					array[i] = array[j];
					array[j] = temporary;
				}
			}
		}
		for (int x = 0; x < 3; x += 1) {
			System.out.println(array[x]);
		}
	}
}