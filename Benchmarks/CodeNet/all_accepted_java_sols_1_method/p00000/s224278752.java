class Main {
	public static void main(String[] a) {
		final String nl = System.lineSeparator();
		final StringBuilder sb = new StringBuilder();

		for (int x = 1; x <= 9; x++) {
			for (int y = 1; y <= 9; y++) {
				sb.append(x);
				sb.append("x");
				sb.append(y);
				sb.append("=");
				sb.append(x * y);
				sb.append(nl);
			}
		}

		System.out.print(sb.toString());
	}
}