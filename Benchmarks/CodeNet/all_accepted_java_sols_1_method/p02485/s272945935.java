import java.io.*;

public class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			while(true) {
				String line = reader.readLine();
				int sum = 0;
				if(line.charAt(0) == '0')
					break;

				for(int i = 0; i < line.length(); i++)
					sum += Character.getNumericValue(line.charAt(i));

				System.out.println(sum);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}