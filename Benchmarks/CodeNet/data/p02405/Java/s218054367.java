import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		InputReader in = new InputReader(System.in);
		
		while (true) {
			int height = in.readInt();
			int width = in.readInt();
			if (height == 0 && width == 0) break;
			
			StringBuilder sBuffer = new StringBuilder();
			for (int i = 0; i < height; i++) {		
				for (int j = 0; j < width; j++) {
					if ((i + j) % 2 == 0) {
						sBuffer.append("#");
					}else {
						sBuffer.append(".");
					}
				}
				sBuffer.append("\n");
			}
			System.out.println(sBuffer.toString());
		}
	}
}

class InputReader{
	private BufferedReader br;
	private StringTokenizer buffer = null;	
	
	public InputReader(InputStream in) {
		br = new BufferedReader(new InputStreamReader(in));				
	}

	public String read() throws IOException {
		while(buffer == null || !buffer.hasMoreTokens()) {
			buffer = new StringTokenizer(br.readLine());
		}
		return buffer.nextToken();
	}
	
	public int readInt() throws IOException {
		while(buffer == null || !buffer.hasMoreTokens()) {
			buffer = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(buffer.nextToken());
	}
}
