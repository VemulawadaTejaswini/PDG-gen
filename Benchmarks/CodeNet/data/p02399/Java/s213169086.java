import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int inta = 0;
		int intb = 0;

		//?§£????????°
		int intd = 0;
		int intr = 0;
		double dbf = 0.0;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strInput = br.readLine();

			ArrayList<Integer> NumList = new ArrayList<Integer>();

			String[] strNumList = strInput.split(" ", 0);

			for (int i = 0; i < strNumList.length; i++) {
				NumList.add(Integer.parseInt(strNumList[i]));
			}

			inta = NumList.get(0);
			intb = NumList.get(1);

			intd = inta / intb;
			intr = inta % intb;
			dbf = (double)inta / (double)intb;

			System.out.println(intd + " " + intr + " " + dbf);
		} catch (IOException e) {
			System.out.println(e);
		}catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

}