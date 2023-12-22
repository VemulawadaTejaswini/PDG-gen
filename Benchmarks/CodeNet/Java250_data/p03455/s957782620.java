import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] input = new String[2];
		String line = in.readLine();

		input = line.split(" ");
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);

		if((a % 2) * (b % 2) % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}
}