import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null) {
			String ns[] = str.split(",");
			int len[] = new int[10];
			int v1, v2;
			for(int i = 0; i < 10; i++) {
				len[i] = Integer.parseInt(ns[i]);
				if(i > 0) len[i] += len[i - 1];
			}
			v1 = Integer.parseInt(ns[10]);
			v2 = Integer.parseInt(ns[11]);
			for(int i = 0; i < 10; i++) {
				if(len[9] * v1 <= (v1 + v2) * len[i]) {
					System.out.println(i+1);
					break;
				}
			}
		}
	}
}