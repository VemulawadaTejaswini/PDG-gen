import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] streamLine = br.readLine().split(" ");
		
		int[] intLine = new int[3];
		for (int i = 0; i < 3; i++) {
			intLine[i] = Integer.parseInt(streamLine[i]);
		}
		
		Arrays.sort(intLine);
		
		System.out.printf("%d %d %d\n", intLine[0], intLine[1], intLine[2]);
	}
}
