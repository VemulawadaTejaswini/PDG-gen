import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		while ((s = br.readLine()) != null) {
			int data = Integer.parseInt(s);

			int num = 0;
			for (int a = 0; a < 10; a++)
				for (int b = 0; b < 10; b++)
					for (int c = 0; c < 10; c++)
						for (int d = 0; d < 10; d++)
							if (a + b + c + d == data)
								num++;

			System.out.println(num);
		}
	}
}