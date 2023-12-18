import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws Exception {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		String[] list1 = new String[3001];
		char[] list2 = new char[3001];
		char[] list3 = new char[3001];
		int i = 0;

		while (true) {
			list1[i] = br.readLine();

			list2[i] = list1[i].charAt(0);
			list3[i] = list1[i].charAt(2);

			if ("0".equals(list2[i])
					|| Integer.parseInt(String.valueOf(list2[i])) == Integer.parseInt(String.valueOf(list3[i]))) {
				for (int j = 0; j < list1[i].length(); j++) {
					System.out.println(list2[j] + " " + list3[j]);
				}
				break;
			}
			i = i + 1;
		}

	}
}