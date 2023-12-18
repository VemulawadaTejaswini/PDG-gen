import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			//Input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			int num;
			long fact;

			while ((str = br.readLine()) != null) {
				num = Integer.parseInt(str);
				fact = 1;
				for (int i = 1; i <= num; i++) {
					fact = fact * i;
				}
				System.out.println(fact);
			}
			//Output
		} catch (Exception e) {
			System.out.println("error");
		}
	}

}