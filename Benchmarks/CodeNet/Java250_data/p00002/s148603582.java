import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		while (str != null) {
			String[] arrays = str.split("\\s", 0);
			int num = Integer.parseInt(arrays[0]) + Integer.parseInt(arrays[1]);
			System.out.println(Integer.toString(num).length());
			str = br.readLine();
		}
	}
}