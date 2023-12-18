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
			if ((a < b) && (b < c)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
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