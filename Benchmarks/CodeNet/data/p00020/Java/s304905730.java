import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		byte[]	codes= reader.readLine().getBytes();

		for(int i = 0; i < codes.length; i++){
			codes[i] += (0x41 <= codes[i] && codes[i] <= 0x5a) ? 0x20 :
						(0x61 <= codes[i] && codes[i] <= 0x7a) ? -0x20: 0;
		}

		System.out.println(new String(codes));
	}
}