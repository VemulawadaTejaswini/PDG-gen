import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<Double[]> list = new ArrayList<Double[]>();


		for(int i = 0, loopMax = Integer.parseInt(reader.readLine()); i < loopMax; i++){
			String[] 	strings = reader.readLine().split(" ");
			double[]	values  = new double[strings.length];

			for(int j = 0; j < values.length; j++) values[j] = Double.parseDouble(strings[j]);

			Double[] array = new Double[3];
			double a1 = 2 * (values[2] - values[0]);
			double a2 = 2 * (values[4] - values[0]);
			double b1 = 2 * (values[3] - values[1]);
			double b2 = 2 * (values[5] - values[1]);
			double c1 = ((values[0] * values[0]) - (values[2] * values[2])) + ((values[1] * values[1]) - (values[3] * values[3]));
			double c2 = ((values[0] * values[0]) - (values[4] * values[4])) + ((values[1] * values[1]) - (values[5] * values[5]));

			array[0] = (b1 * c2 - b2 * c1) / (a1 * b2 - a2 * b1);
			array[1] = (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);

			double dx = Math.abs(array[0] - values[0]);
			double dy = Math.abs(array[1] - values[1]);

			array[2] = Math.sqrt(dx * dx + dy * dy);
			list.add(array);
		}

		for(Double[] array : list){
			double x, y, r;

			x = (-0.0005 < array[0] && array[0] < 0.0005) ? 0 : array[0];
			y = (-0.0005 < array[1] && array[1] < 0.0005) ? 0 : array[1];
			r = (-0.0005 < array[2] && array[2] < 0.0005) ? 0 : array[2];

			System.out.printf("%.3f %.3f %.3f\n", x, y, r);

		}
	}

}