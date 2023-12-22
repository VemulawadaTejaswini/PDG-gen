import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int times = 1;
		while(true) {
			String str = br.readLine();
			String[] s = str.split(" ");
			int[] n = new int[s.length];
			for (int i = 0; i < s.length; i++) {
				n[i] = Integer.parseInt(s[i]);
			}
			
			if (n[0] == 0 && n[1] == 0) {
				break;
			}
			System.out.println(Math.min(n[0], n[1]) + " " + Math.max(n[0], n[1]) );
			times++;
		}
	}
}