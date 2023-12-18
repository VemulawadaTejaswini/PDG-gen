import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		char answer = 'A';
		try {
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if(line.indexOf(answer) != -1){
					if(line.indexOf(answer) == 0) answer = line.charAt(2);
					else answer = line.charAt(0);
				}
			}
			System.out.println(answer);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}