import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		double inta = 0;
		double intb = 0;

		//?§£????????°
		double intd = 0;
		double intr = 0;
		double dbf = 0.0;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strInput = br.readLine();

			ArrayList<Double> NumList = new ArrayList<Double>();

			String[] strNumList = strInput.split(" ", 0);

			for (int i = 0; i < strNumList.length; i++) {
				NumList.add(Double.parseDouble(strNumList[i]));
			}

			inta = NumList.get(0);
			intb = NumList.get(1);

			intd = inta / intb;
			intr = inta % intb;
			dbf = (double)inta / (double)intb;

			System.out.println((int)intd + " " + intr + " " + String.format("%.5f", dbf));
		} catch (IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
	}
}