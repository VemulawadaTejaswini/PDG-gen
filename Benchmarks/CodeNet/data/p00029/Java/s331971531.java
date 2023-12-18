import java.io.*;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			String[] tmp = line.split(" ");
			String lng = "a";
			int[][] cnt = new int[tmp.length][2];
			int max = 0, maxIndex = 0;
			for(int i=0; i<tmp.length; i++) {
				if(lng.length() < tmp[i].length()) {
					lng = tmp[i];
				}
				for(int j=0; j<=i; j++) {
					if(tmp[i].equals(tmp[j])) {
						cnt[i][1]++;
					}
				}
				cnt[i][0] = cnt[i][1];
				cnt[i][1] = 0;
				if(cnt[i][0] > max) {
					max = cnt[i][0];
					maxIndex = i;
				}
			}
			System.out.println(tmp[maxIndex] + " " + lng);
		} catch (Exception e) {
			
		}
	}

}