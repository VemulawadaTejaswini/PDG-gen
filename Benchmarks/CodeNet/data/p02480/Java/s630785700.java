import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws  IOException {
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(input.readLine());
		
		System.out.println(x*x*x);
		
		
	}

}