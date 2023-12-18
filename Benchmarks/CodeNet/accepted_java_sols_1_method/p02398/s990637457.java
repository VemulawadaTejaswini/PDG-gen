import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] hikakuStr = line.split("[\\s]+");

		int a = Integer.parseInt(hikakuStr[0]);
		int b = Integer.parseInt(hikakuStr[1]);
		int c = Integer.parseInt(hikakuStr[2]);
		int count = 0;
		// TODO ?????????????????????????????????????????????
		for (int i = a; i <= b; i++) {
			if (c % i == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}