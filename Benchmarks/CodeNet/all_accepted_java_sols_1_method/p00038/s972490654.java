import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		while((str = br.readLine()) != null) {
			String ns[] = str.split(",");
			int count[] = new int[13];
			for(int i = 0; i < 5; i++) {
				count[Integer.parseInt(ns[i]) - 1]++;
			}
			boolean flag = false;
			for(int i = 0; i < 10; i++) {
				if(count[i] == 1) {
					if(count[i+1] == 1 && count[i+2] == 1 && count[i+3] == 1 && count[(i+4) % 13] == 1) {
						System.out.println("straight");
						flag = true;
						break;
					}
				}
			}
			if(flag) continue;
			int pair[] = new int[2];
			int cnt = 0;
			for(int x : count) {				
				if(x >= 2) {
					pair[cnt] = x;
					cnt++;
				}
			}
			if(pair[0] == 4) {
				System.out.println("four card");
				continue;
			} else if(pair[0] == 3 && pair[1] == 2 || pair[0] == 2 && pair[1] == 3) {
				System.out.println("full house");
				continue;
			} else if(pair[0] == 3) {
				System.out.println("three card");
				continue;
			} else if(pair[0] == 2 && pair[1] == 2) {
				System.out.println("two pair");
				continue;
			} else if(pair[0] == 2) {
				System.out.println("one pair");
				continue;
			} else {
				System.out.println("null");
			}
		}
	}
}