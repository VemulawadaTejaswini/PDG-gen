import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		if (1 <= A  && A <= 9 && 1 <= B  && B <= 9) {
			System.out.println(A * B);
		}
		else {
			System.out.println("-1");
		}
	}
}