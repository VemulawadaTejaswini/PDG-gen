
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String args[]) throws IOException {
	// 2020/1/30 No.150
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String str[] = br.readLine().split(" ");
	int n = Integer.parseInt(str[0]);
	int m = Integer.parseInt(str[1]);

	br.close();

	if (500 * n >= m)
		System.out.println("Yes");
	else
		System.out.println("No");
	}
}