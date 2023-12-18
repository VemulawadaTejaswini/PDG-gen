import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		String			getData;
		BufferedReader 	reader = new BufferedReader(new InputStreamReader(System.in));


		while((getData = reader.readLine()) != null){
			String[]	dataList =getData.split(" ");
			double[]		valueList= new double[dataList.length];

			for(int i = 0; i < dataList.length; i++){
				valueList[i] = Double.parseDouble(dataList[i]);
			}

			double x = (valueList[2] * valueList[4] - valueList[1] * valueList[5]) / (valueList[0] * valueList[4] - valueList[1] * valueList[3]);
			double y = (valueList[5] * valueList[0] - valueList[2] * valueList[3]) / (valueList[0] * valueList[4] - valueList[3] * valueList[1]);

			if(-0.0005 < x && x < 0.0005)	x = 0;
			if(-0.0005 < y && y < 0.0005)	y = 0;

			System.out.printf("%.3f %.3f\n", x, y);

		}

	}
}