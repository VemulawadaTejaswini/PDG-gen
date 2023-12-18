import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num;
			while ((num = Integer.parseInt(br.readLine())) != 0) {
				int total = 0;
				for (int i = 0; i < num; i = i + 4) {
					int hit = Integer.parseInt(br.readLine());
					total += hit;
				}
				System.out.println(total);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

