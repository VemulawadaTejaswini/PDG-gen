
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] a) throws IOException{

		String strLine ="";
		BufferedReader stdReader =
				new BufferedReader(new InputStreamReader(System.in));

		int week = 0;
		double lentMoney = 100000;

		while  ((strLine = stdReader.readLine()) != null) {
			week = Integer.parseInt(strLine);
		}

		for(int i = 0; i < week ; i++){
			lentMoney = Math.ceil((lentMoney/1000) * 1.05) *1000;
		}
			//1000???????????????????????????
			int n = (int) lentMoney;

			System.out.println(n);

	}

}