import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		new Main().exec();
	}
	
	public void exec() throws IOException {
		int n = readInt();
		
		int[] aArray = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			aArray[i] = readInt();
			sum += aArray[i];
		}
		Arrays.sort(aArray);
		
		System.out.println(aArray[0] + " " + aArray[n - 1] + " " + sum);		
	}
	
	BufferedReader br;
	StringTokenizer buffer = null;
	
	public String read() throws IOException {
		while(buffer == null || !buffer.hasMoreTokens()) {
			br = new BufferedReader(new InputStreamReader(System.in));
			buffer = new StringTokenizer(br.readLine());
		}
		return buffer.nextToken();
	}
	
	public int readInt() throws IOException {
		while(buffer == null || !buffer.hasMoreTokens()) {
			br = new BufferedReader(new InputStreamReader(System.in));
			buffer = new StringTokenizer(br.readLine());
		}
		return Integer.parseInt(buffer.nextToken());
	}
	
}
