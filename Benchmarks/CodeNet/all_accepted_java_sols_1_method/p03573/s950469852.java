import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		String[] list = str.split(" ");
		if(list[0].equals(list[1])) {
			System.out.println(list[2]);
		}else if(list[0].equals(list[2])) {
			System.out.println(list[1]);
		}else {
			System.out.println(list[0]);
		}
	}
}
