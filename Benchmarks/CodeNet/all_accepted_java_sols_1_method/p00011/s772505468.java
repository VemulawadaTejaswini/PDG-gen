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
		String[] buf;
		int leader, trailer;
		for(int i = 0;i < n;i++){
			buf = br.readLine().split(",");
			leader = Integer.parseInt(buf[0]) - 1;
			trailer = Integer.parseInt(buf[1]) - 1;
			int tmp = lots[leader];
			lots[leader] = lots[trailer];
			lots[trailer] = tmp;
		}
		for(int i = 0;i < lots.length;i++){
			System.out.println(lots[i]);
		}
	}
}