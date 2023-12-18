import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

class Main {
	public static void main(String args[]) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		try {
			String buf = null;
			int n;
			while (!(buf = br.readLine()).equals("0")) {
				HashMap<Character, Character> map = new HashMap<Character, Character>();
				n = Integer.parseInt(buf.trim());
				for (int i=0;i<n;i++) {
					String str = br.readLine();
					Character key = str.charAt(0);
					Character val = str.charAt(2);
					map.put(key, val);
				}
				n = Integer.parseInt(br.readLine().trim());
				for (int i=0;i<n;i++) {
					Character c = br.readLine().charAt(0);
					if (map.containsKey(c)) {
						System.out.print(map.get(c));
					} else {
						System.out.print(c);
					}
				}
				System.out.println("");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}