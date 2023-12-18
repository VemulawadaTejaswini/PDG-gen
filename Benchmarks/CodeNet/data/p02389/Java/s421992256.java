import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;

		String strNum = null;
		try {
			BufferedReader insLine = new BufferedReader(new InputStreamReader(System.in));
			strNum = insLine.readLine();

			a = Integer.parseInt(strNum);

			insLine = new BufferedReader(new InputStreamReader(System.in));
			strNum = insLine.readLine();

			b = Integer.parseInt(strNum);

			if (1 <= a && a <= 100) {

				if (1 <= b && b <= 100) {

					System.out.println(a * b);
				}
				/*else{
					System.out.println("b = ERROR");
				}*/
			}
			/*else{
				System.out.println("a = ERROR");
			}*/

		} catch (IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}