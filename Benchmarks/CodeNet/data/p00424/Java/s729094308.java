import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		String 	strCount = "";
		int 	cmd = 0;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while((cmd = Integer.parseInt(bufferedReader.readLine())) != 0) {

			strCount = String.valueOf(cmd);
			ArrayList<String[]> alConvertCharAt = new ArrayList<String[]>();
			ArrayList<Boolean> alConvertFlg = new ArrayList<Boolean>();
			//Count
			for(int i = 0; i < Integer.parseInt(strCount); i++) {
				alConvertCharAt.add(bufferedReader.readLine().split(" "));
				alConvertFlg.add(true);
			}

			strCount = bufferedReader.readLine();
			StringBuffer strBuffConverted = new StringBuffer(Integer.parseInt(strCount));

			for(int i = 0; i < Integer.parseInt(strCount); i++) {
				String befConvCharAt = bufferedReader.readLine();

				int arrConvCharAtCounter = 0;
				boolean isNoConvert = true;

				for(String[] arrConvChart: alConvertCharAt) {
					if(arrConvChart[0].equals(befConvCharAt)){
						if(alConvertFlg.get(arrConvCharAtCounter)) {
							strBuffConverted.append(arrConvChart[1]);
							alConvertFlg.set(arrConvCharAtCounter, false);
						} else {
							strBuffConverted.append(arrConvChart[0]);
						}

						isNoConvert = false;
						break;
					}
				}

				if(isNoConvert) strBuffConverted.append(alConvertCharAt.get(i)[0]);
			}

			System.out.println(strBuffConverted.toString());
		}
	}
}