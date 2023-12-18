
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
	
		
		String s;
		while ((s = reader.readLine()) != null) {
			int count = 0;
			int a = Integer.parseInt(s);
			for (int i = 0; i < 10; i++)
				for (int j = 0; j < 10; j++)
					for (int k = 0; k < 10; k++)
						for (int l = 0; l < 10; l++)
							if (i + j + k + l == a)
								count++;
			System.out.println(count);
		}

	}

}