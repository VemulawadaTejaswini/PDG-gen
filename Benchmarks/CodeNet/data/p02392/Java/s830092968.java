import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		String strInput = null;
		String strMessage = null;

		int[] intNumList = new int[3];
		try {
			//??\????????????????????????
			BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
			strInput = strLine.readLine();

			String[] strNumList = strInput.split(" ");

			//int????????????
			for (int i = 0; i < strNumList.length; i++) {
				intNumList[i] = Integer.parseInt(strNumList[i]);
			}

			for (int i = 0; i < intNumList.length; i++) {

				//
				if (strMessage == null) {
					for (int j = i + 1; j < intNumList.length;j++) {

						if(intNumList[i] >= intNumList[j]){
							//?????¶ a < b < c????????????????????´???
							strMessage = "No";
							break;
						}
					}
				}else {
					break;
				}
			}

			//?????¶ a < b < c??????????????´???
			if (strMessage == null) {
				strMessage = "Yes";
			}

			//???????????????
			System.out.println(strMessage);

		}catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}

	}

}