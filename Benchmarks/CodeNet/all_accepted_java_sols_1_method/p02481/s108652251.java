import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String line = input.readLine();
		String[] num = line.split(" ");
		int x = Integer.parseInt(num[0]);
		int y = Integer.parseInt(num[1]);
		
		System.out.println(x * y + " " + (2*x + 2*y));
		
	}

}