import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int a = 0;
		int b = 0;

		int intjudge = 0;
		String strInput = null;

		try {
			//??\????????????????????????
			BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
			strInput = strLine.readLine();

			String[] strNumList = strInput.split(" ");

			a = Integer.parseInt(strNumList[0]);
			b = Integer.parseInt(strNumList[1]);

			//??\?????°???????????§??????
			if (-1000 <= a && a <= 1000) {

				if (-1000 <= b && b <= 1000) {

					intjudge = (a - b);

					//???????????????
					if (intjudge > 0) {
						System.out.println("a > b");
					}else if (intjudge == 0) {
						System.out.println("a == b");
					}else {
						System.out.println("a < b");
					}
				}
				//if????????§????????¨
				/*else{
					System.out.println("b = ERROR");
				}*/
			}
			/*else{
				System.out.println("a = ERROR");
			}*/

			//??¨????????????
		} catch (IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}