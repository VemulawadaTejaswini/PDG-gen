
import java.io.*;
import java.util.Arrays;

public class Main {

	//ツ　0522JOI and IOI
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
		
		String s = reader.readLine();
		if (s == null)
			break;
		
		int joi = 0;
		int ioi = 0;
		
		for(int i = 0; i <= s.length() - 3; i++) {
			if (s.substring(i, i + 3).equals("JOI")) 
				joi++;
			if (s.substring(i, i + 3).equals("IOI")) 
				ioi++;
		}
		System.out.printf("%d\n%d\n", joi, ioi);
		}
		reader.close();
	}
}