import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String[] tmp = br.readLine().split(" ");
			long h = Long.parseLong(tmp[0]);
			long w = Long.parseLong(tmp[1]);
			tmp = null;
			if (h == 0 && w == 0)break;
			else write(h, w);
		}
	}

	private static void write(long h, long w) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < w;i++){
			sb.append("#");
		}
		sb.append(String.format("%n"));
		String header = sb.toString();
		String footer = header;
		
		sb.delete(0, sb.length());
		
		sb.append("#");
		for(int i = 0;i < w - 2;i++){
			sb.append(".");
		}
		sb.append(String.format("#%n"));
		String body = sb.toString();
		
		sb.delete(0, sb.length());
		
		sb.append(header);
		for(int i = 0;i < h - 2;i++){
			sb.append(body);
		}
		sb.append(footer);
		System.out.println(sb.toString());
		sb = null;
	}
}