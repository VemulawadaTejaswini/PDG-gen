import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long dog = Long.parseLong(br.readLine());
		String res = "";
		
		while(dog-- > 0) {
			res = (char)('a' + (dog%26)) + res;
			dog /= 26;
		}
		
		bw.write(res + "\n");
		bw.flush();
	}

}
