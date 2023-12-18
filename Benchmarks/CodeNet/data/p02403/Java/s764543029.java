import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb;
		String[] strs;
		int H, W;
		
		do {
			sb = new StringBuilder();
			
			strs = br.readLine().split("\\s+");
			
			H = Integer.parseInt(strs[0]);
			W = Integer.parseInt(strs[1]);
			
			if (H == 0 && W == 0) break;
			
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) sb.append("#");
				sb.append("\n");
			}
			
			System.out.println(sb);
		} while (true);
	}
}