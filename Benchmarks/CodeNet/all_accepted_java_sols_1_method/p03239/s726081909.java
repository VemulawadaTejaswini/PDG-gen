import java.io.*;
 
public class Main {
 
	public static void main(String args[]) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = in.readLine();
			Integer n = Integer.valueOf(str.split(" ")[0]);
			Integer t = Integer.valueOf(str.split(" ")[1]);
			int max = Integer.MAX_VALUE;
			for(int i=0;i<n;i++) {
				str = in.readLine();
				Integer cost = Integer.valueOf(str.split(" ")[0]);
				Integer time = Integer.valueOf(str.split(" ")[1]);
				if(time<=t) {
					if(cost<max) {
						max = cost;
					}
				}
			}
			if(max == Integer.MAX_VALUE) {
				System.out.println("TLE");
			}
			else {
				System.out.println(max);
			}
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
 
}