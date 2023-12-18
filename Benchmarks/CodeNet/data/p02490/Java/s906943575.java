import java.io.BufferedReader;
import java.io.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String array[] = br.readLine().split(" ");
			int a = Integer.parseInt(array[0]);
			int b = Integer.parseInt(array[1]);
			if (a == 0 && b == 0) {
				break;
			}
			if (a < b) {
				System.out.println(a + " " + b);
			} else {
				System.out.println(b + " " + a);
			}
		}
	}

}