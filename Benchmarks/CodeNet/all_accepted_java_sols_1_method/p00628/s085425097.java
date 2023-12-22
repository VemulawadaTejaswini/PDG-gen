import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			while (!(str = br.readLine()).equals("END OF INPUT")) {
				String[] ward = str.split(" ", -1);
				for (int i = 0; i < ward.length; i++) {
					System.out.print(ward[i].length());
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}

