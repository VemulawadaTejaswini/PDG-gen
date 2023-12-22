
import java.io.*;
import java.util.*;

public class Main {

	//ツ　2204 Problem A: ツ甘コツ鳴鳴篠篠個ア!
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		for(;;) {
		
			String s = reader.readLine();
			int n = Integer.parseInt(s);
			if (n == 0)
				break;
			int max = 0;
			int min = 9999;
			
			for(int i = 0; i < n; i++) {
				s = reader.readLine();
				String[] sp = s.split(" ");
				int sum = 0;
				for(int j = 0; j < 5; j++) {
					sum += Integer.parseInt(sp[j]);
				}
				max = Math.max(max, sum);
				min = Math.min(min, sum);
			}
			System.out.printf("%d %d\n", max, min);
		}		
		
		reader.close();
		
	}

}