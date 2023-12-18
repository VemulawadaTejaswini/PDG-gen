import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		char tmp[] = new char[] {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
		int calc[] = new int[] {1, 5, 10, 50, 100, 500, 1000};
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null) {
			char c[] = str.toCharArray();
			int ret = 0;
			int cur = 7, prev = 7;
			for(int i = 0; i < str.length(); i++) {
				for(int j = 0; j < 7; j++) {
					if(c[i] == tmp[j]) {
						prev = cur;
						cur = j;
						break;
					}
				}
				if(cur > prev) ret -= 2 * calc[prev];
				ret += calc[cur];
			}
			System.out.println(ret);
		}
	}
}