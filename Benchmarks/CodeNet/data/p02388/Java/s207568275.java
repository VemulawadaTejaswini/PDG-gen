import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		String strNum = null;

		int x = 0;
		//int intAnser = x * x * x;

		try{
			System.out.println("??°????????\?????????????????????");

			BufferedReader insLine = new BufferedReader(new InputStreamReader(System.in));
			strNum = insLine.readLine();

			x = Integer.parseInt(strNum);

			if (x >=1  && x <= 100) {

				System.out.println(x * x * x);
			}else{
				System.out.println("??\?????°?????????????????§???");
			}

		}catch (IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}