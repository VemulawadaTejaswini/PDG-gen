
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		try (InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);) {
			String[] recA = br.readLine().split(" ");
			String[] recB = br.readLine().split(" ");
			long T = Long.parseLong(br.readLine());
			long afterA = Long.parseLong(recA[0]) + T * Long.parseLong(recA[1]);
			long afterB = Long.parseLong(recB[0]) + T * Long.parseLong(recB[1]);
			if (afterA >= afterB) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
