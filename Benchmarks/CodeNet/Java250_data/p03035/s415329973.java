import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//BufferedReader in = new BufferedReader(new FileReader(new File("input.txt")));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] line = in.readLine().split(" ");
		int a = Integer.valueOf(line[0]);
		int b = Integer.valueOf(line[1]);
		if(a <= 5) {
			System.out.println("0");
		}else if(a <= 12) {
			System.out.println(b/2);
		}else {
			System.out.println(b);
		}
	}
}