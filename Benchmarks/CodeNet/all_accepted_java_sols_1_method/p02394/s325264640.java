import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		String strAnser = null;

		int[] intNumList = new int[5];

		int intW =0;
		int intH =0;
		int intx =0;
		int inty =0;
		int intr =0;

		boolean NumOk = false;

		try {
			//??\????????????
			BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
			String strInput = strLine.readLine();

			String[] strNumList = strInput.split(" ", 0);

			//int????????????
			intW = Integer.parseInt(strNumList[0]);
			intH = Integer.parseInt(strNumList[1]);
			intx = Integer.parseInt(strNumList[2]);
			inty = Integer.parseInt(strNumList[3]);
			intr = Integer.parseInt(strNumList[4]);

			//??\?????°???????????§??????
			if (0 < intH && intH <= 100) {
				if (0 < intW && intW <= 100) {
					if (-100 < intx && intx <= 100) {
						if (0 < intr && intr <= 100) {
							NumOk = true;
						}
					}
				}
			}

			if (NumOk) {
				if (0 <= intx - intr && intx + intr <= intW) {
					if (0 <= inty - intr && inty + intr <= intH) {
						strAnser = "Yes";
					}
				}
			}
			if (strAnser == null) {
				strAnser = "No";
			}
			System.out.println(strAnser);

		}catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}
}