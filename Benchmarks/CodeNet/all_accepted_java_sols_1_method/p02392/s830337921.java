import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] streamLine = br.readLine().split(" ");
		int a = Integer.parseInt(streamLine[0]);
		int b = Integer.parseInt(streamLine[1]);
		int c = Integer.parseInt(streamLine[2]);
		
		String res = "No";
		if ( a < b && b < c) {
			res = "Yes";
		}
		System.out.println(res);
	}
}
