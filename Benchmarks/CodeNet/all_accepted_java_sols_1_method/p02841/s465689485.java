import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] d1 = r.readLine().split(" ");
		String[] d2 = r.readLine().split(" ");

		if(d1[0].equals(d2[0])) {
			System.out.println("0");
		} else {
			System.out.println("1");
		}

		r.close();
	}
}