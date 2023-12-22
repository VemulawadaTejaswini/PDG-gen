import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] hikakuStr = line.split("[\\s]+");

		int syo = Integer.parseInt(hikakuStr[0]);
		int chu = Integer.parseInt(hikakuStr[1]);
		int dai = Integer.parseInt(hikakuStr[2]);

		if ((syo < chu) && (chu < dai)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}