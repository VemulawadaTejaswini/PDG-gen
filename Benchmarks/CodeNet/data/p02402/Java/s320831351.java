
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		InputReader in = new InputReader(System.in);
		
		int n = in.readInt();
		
		int[] aArray = new int[n];
		long sum = 0;
		for (int i = 0; i < n; i++) {
			aArray[i] = in.readInt();
			sum += aArray[i];
		}
		Arrays.sort(aArray);
		
		System.out.println(aArray[0] + " " + aArray[n - 1] + " " + sum);		
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
