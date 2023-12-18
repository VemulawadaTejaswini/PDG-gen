import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] num = str.split(" ", 0);
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		int multiple = a * b;
		int nagasa = (a + b) * 2;

		System.out.println(multiple + " " + nagasa);
	}

}