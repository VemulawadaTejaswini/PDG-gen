import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		int intWidth = 0;
		int intHeight = 0;
		int intRectangleArea = 0;
		int intRectanglePeriphery = 0;
		int intMathFormula = 2;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String strWH = br.readLine();
		String[] strList = strWH.split(" ");

		String strWidth = strList[0];
		intWidth = Integer.parseInt(strList[0]);

		String strHeight = strList[1];
		intHeight = Integer.parseInt(strList[1]);

		intRectangleArea = intWidth * intHeight;

		intRectanglePeriphery = intMathFormula * (intWidth + intHeight);

		System.out.println(intRectangleArea + " " + intRectanglePeriphery);
	}
}
