class Main {
	public static void main(String[] a) {
		for (int x = 1; x < 10; x++) {
			for (int y = 1; y < 10; y++) {
				String str_x = Integer.toString(x);
				String str_y = Integer.toString(y);
				System.out.println(str_x + 'x' + str_y + '=' + x * y);
			}
		}
	}
}