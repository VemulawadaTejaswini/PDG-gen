import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] list = str.split(" ");
		int a = Integer.parseInt(list[0]);
		int b = Integer.parseInt(list[1]);
		
		int d = a / b ;
		int r = a % b ;
		double f = (double)a / b ;
		
		System.out.print(d + " " + r + " ");
		System.out.printf("%.5f", f);
		
	}

}