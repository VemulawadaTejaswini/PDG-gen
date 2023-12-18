import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] str = reader.readLine().split(" ");
		int[] abc = new int[str.length];
		for (int i = 0; i < 3; i++) {
			abc[i]= Integer.parseInt(str[i]);
		}
		if (abc[0] == abc[1] && abc[1] == abc[2]) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}