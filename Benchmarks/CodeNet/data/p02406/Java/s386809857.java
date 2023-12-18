import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		InputStreamReader insISR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(insISR);
		int intA = 1;
	//	System.out.println("????????\????????????????????????");
		try {
			String strLine = reader.readLine();
			int intNum = Integer.parseInt(strLine);
			int intYakusuu = 0;
			int intThreetimes = 3;
			String strCheckNum = "3";
			intYakusuu = intNum % intThreetimes;
			while(intA <= intNum) {
				String strA = String.valueOf(intA);
				boolean isOk1 = false;
				boolean isOk2 = false;
				intYakusuu = intA % intThreetimes;
				int intYakusuu1 = intA % 10;
				if(intYakusuu == 0) {
					System.out.print(" "+intA);
					intThreetimes = intThreetimes + 3;
					isOk1 = true;
				}
				else if(intYakusuu1 == 3) {
					System.out.print(" "+intA);
					isOk2 = true;
				}
				else if(strA.indexOf(strCheckNum) != -1) {
					System.out.print(" "+strA);
				}
				intA = intA + 1;
			}
			System.out.println("");
		}catch(IOException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}