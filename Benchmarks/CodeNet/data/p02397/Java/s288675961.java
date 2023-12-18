import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();

		while(true) {
			String line = br.readLine();
			String[] strArray = line.split(" ");
			int[] intArray = new int[strArray.length];
			intArray[0] = Integer.parseInt(strArray[0]);
			intArray[1] = Integer.parseInt(strArray[1]);

			if (intArray[0] == 0 && intArray	[1] ==0) {
				break;
			}

			if (intArray[0] < intArray[1]) {
				sb.append(intArray[0]).append(" ").append(intArray[1]).append("\n");
			} else {
				sb.append(intArray[1]).append(" ").append(intArray[0]).append("\n");
			}
		}
		System.out.print(sb.toString());
	}
}