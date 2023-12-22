import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int intx = 0;
		int intCount = 0;

		try {

			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while(true){
				String strline = br.readLine();

				if (strline != null) {
					intx = Integer.parseInt(strline);
					if (1 <= intx && intx <= 10000) {
						//??¶??°?????§????????¨
						intCount++;

						//??????
						System.out.println("Case " +  intCount + ": " + intx);
					}else{
						break;
					}
				}else{
					break;
				}
			}
			/*for (int i = 0; i < 10000; i++) {

				//??\????????????
				BufferedReader strLine = new BufferedReader(new InputStreamReader(System.in));
				String strInput = strLine.readLine();

				intx = Integer.parseInt(strInput);

				if (1 <= intx && intx <= 10000) {
					//??¶??°?????§????????¨
					intCount++;

					//??????
					System.out.println("Case " +  intCount + ": " + intx);
				}else{
					break;
				}
			}*/
			//System.out.println(intCount);
		}catch (IOException e1) {
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}

}