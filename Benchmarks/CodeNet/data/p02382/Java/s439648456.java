
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		double dbD1 = 0.0;
		double dbD2 = 0.0;
		double dbD3 = 0.0;
		double dbMax = 0.0;


		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String str = br.readLine();
			str = br.readLine();

			String[] arrX = str.split(" ");

			int[][] intArrX = new int[2][arrX.length];


			str = br.readLine();
			String[] arrY = str.split(" ");

			for (int i = 0; i < arrY.length; i++) {


				intArrX[0][i] = Integer.parseInt(arrX[i]);
				intArrX[1][i] = Integer.parseInt(arrY[i]);

				dbD1 += Math.abs(intArrX[0][i] - intArrX[1][i]);

				dbD2 += Math.abs(intArrX[0][i] - intArrX[1][i])
						* Math.abs(intArrX[0][i] - intArrX[1][i]);

				dbD3 += Math.abs(intArrX[0][i] - intArrX[1][i])
						* Math.abs(intArrX[0][i] - intArrX[1][i])
						* Math.abs(intArrX[0][i] - intArrX[1][i]);

				if (i == 0) {

					dbMax = Math.abs(intArrX[0][i] - intArrX[1][i]);
				} else {


					if (dbMax < Math.abs(intArrX[0][i] - intArrX[1][i])) {
						dbMax = intArrX[0][i] - intArrX[1][i];
					}
				}

			}

			dbD2 = Math.sqrt(dbD2);
			dbD3 = Math.cbrt(dbD3);


			DecimalFormat insdf = new DecimalFormat("0.000000");
			System.out.println(insdf.format(dbD1));
			System.out.println(insdf.format(dbD2));
			System.out.println(insdf.format(dbD3));
			System.out.println(insdf.format(dbMax));

		} catch (IOException e) {
			System.out.println(e);
		} catch (NumberFormatException e) {
			System.out.println("??°?????§??\??????????????????");
		}
	}
}