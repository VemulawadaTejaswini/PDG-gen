public class Main {
	
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int i = 1;
			while (true) {
				String str = reader.readLine();
				if ("0".equals(str)) {
					break;
				}
				System.out.println("Case " + i + ":" + str);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}