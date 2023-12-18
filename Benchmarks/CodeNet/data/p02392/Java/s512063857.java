
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String[] strs = (String[]) br.readLine().split(" ");
			int num1 = Integer.parseInt(strs[0]);
			int num2 = Integer.parseInt(strs[1]);
			int num3 = Integer.parseInt(strs[2]);

			if (num1 < num2 && num2< num3) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}