import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if( line != null ){
			int input = Integer.parseInt(line);
			int HH = input/3600;
			int mi = input%3600/60;
			int SS = input%60;

			System.out.println(HH+":"+mi+":"+SS);
		}
	}

}