import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;i++) {
				System.out.println(br.readLine().replace("Hoshino", "Hoshina"));
			}
		} catch (NumberFormatException e) {
		} catch (IOException e) {
		}
	}
}