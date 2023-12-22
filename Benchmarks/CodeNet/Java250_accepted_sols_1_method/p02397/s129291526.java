import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		//?????£?????????
		int intx = 0;
		int inty = 0;
		int intWork = 0;

		try {
			//??\????????????
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			while (true) {
				String strLine = br.readLine();

				if (strLine != null) {
					String[] strNumList = strLine.split(" ", 0);

					intx = Integer.parseInt(strNumList[0]);
					inty = Integer.parseInt(strNumList[1]);

					if(intx != 0 || inty != 0){
						if (intx > inty) {
							intWork = intx;
							intx = inty;
							inty = intWork;
						}
						System.out.println(intx + " " + inty);
					}else{
						break;
					}
				}else {
					break;
				}
			}
		}catch(IOException e1){
			System.out.println(e1);
		}catch (NumberFormatException e2) {
			System.out.println(e2);
		}
	}
}