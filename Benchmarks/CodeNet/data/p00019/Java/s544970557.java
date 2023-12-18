import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int MAX_DETASET  = 20;
		int cnt = 0;

		ArrayList<String> list = new ArrayList<String>();



		if((strLine = stdReader.readLine()) != null) {

		//??°????????????
		int intStrLine = Integer.parseInt(strLine);
		int k = intStrLine;

		for(int i = intStrLine -1; i > 0 ; i--){
			k = k * i;
		}

		System.out.println(k);


		}

	}

}