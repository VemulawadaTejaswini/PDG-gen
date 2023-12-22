import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int w = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int[] lots = new int[w];
		for(int i = 0;i < lots.length;i++){
			lots[i] = i + 1;
		}
		String[] bufbuf;
		int[] buf;
		for(int i = 0;i < n;i++){
			bufbuf = br.readLine().split(",");
			buf = new int[bufbuf.length];
			for(int j = 0;j < bufbuf.length;j++){
				buf[j] = Integer.parseInt(bufbuf[j])-1;
			}
			int tmp = lots[buf[0]];
			lots[buf[0]] = lots[buf[1]];
			lots[buf[1]] = tmp;
		}
		for(int i = 0;i < lots.length;i++){
			System.out.println(lots[i]);
		}
	}
}