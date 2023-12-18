class Main
{
	public static void main(String[] args) {
		java.io.BufferedReader reader = null;
		try {
			reader = new java.io.BufferedReader(
				new java.io.InputStreamReader(System.in)
				);
			String[] inputs = reader.readLine().split(" ");
			int a = Integer.parseInt(inputs[0]);
			int b = Integer.parseInt(inputs[1]);
			int c = Integer.parseInt(inputs[2]);
			int t;
			if (a > b) {
				t = a;
				a = b;
				b = t;
			}
			if (a > c) {
				t = a;
				a = c;
				c = t;
			}
			if (b > c) {
				t = b;
				b = c;
				c = t;
			}
			System.out.printf("%d %d %d\n", a, b, c);
		} catch (java.io.IOException e ) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (java.io.IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}