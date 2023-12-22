import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long x;
		for(int i = 1;(x = Long.parseLong(br.readLine())) != 0;i++){
			System.out.printf("Case %d: %d%n", i, x);
		}
	}
}