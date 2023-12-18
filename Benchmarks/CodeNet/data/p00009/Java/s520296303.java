import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			while ((line = br.readLine()) != null) {
				ArrayList<Integer> prime = new ArrayList<Integer>();

				line = line.trim();
				int num = Integer.parseInt(line);
				if (num < 0 || num > 999999)System.exit(-1);
				if(num >= 2) {
					int start = 3;
					prime.add(2);
					for(int i = start; i <= num; i+=2) {
						boolean flag = true;
						for(int p : prime) {
							if(i % p == 0) {
								flag = false;
								break;
							} 
						}
						if(flag == true) prime.add(i);
					}
				} 
				
				System.out.println(prime.size());
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}